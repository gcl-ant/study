package day25;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

    public class TwentyFourGame {

        private static final int CARD_COUNT = 4;
        private static final int TARGET_NUMBER = 24;

        public static void main(String[] args) {
            int[] cards = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13};
            List<int[]> combinations = combinations(cards, CARD_COUNT);

            for (int[] combination : combinations) {
                List<Integer> nums = new ArrayList<>(combination.length);
                for (int num : combination) {
                    nums.add(num);
                }
                List<String> expressions = generateExpressions(nums);
                for (String expression : expressions) {
                    if (evaluateExpression(expression) == TARGET_NUMBER) {
                        System.out.println("Solution found: " + expression);
                        return;
                    }
                }
            }
            System.out.println("No solution found.");
        }

        private static List<int[]> combinations(int[] arr, int k) {
            List<int[]> result = new ArrayList<>();
            int[] tmp = new int[k];
            combinations(arr, 0, 0, k, tmp, result);
            return result;
        }

        private static void combinations(int[] arr, int start, int idx, int k, int[] tmp, List<int[]> result) {
            if (idx == k) {
                result.add(Arrays.copyOf(tmp, k));
                return;
            }
            for (int i = start; i < arr.length; i++) {
                tmp[idx] = arr[i];
                combinations(arr, i + 1, idx + 1, k, tmp, result);
            }
        }

        private static List<String> generateExpressions(List<Integer> nums) {
            List<String> result = new ArrayList<>();
            generateExpressions(nums, "", result);
            return result;
        }

        private static void generateExpressions(List<Integer> nums, String expr, List<String> result) {
            if (nums.isEmpty()) {
                result.add(expr);
                return;
            }
            Integer num = nums.remove(0);
            generateExpressions(new ArrayList<>(nums), expr + num, result);
            generateExpressions(new ArrayList<>(nums), expr + "+" + num, result);
            generateExpressions(new ArrayList<>(nums), expr + "-" + num, result);
            generateExpressions(new ArrayList<>(nums), expr + "*" + num, result);
            generateExpressions(new ArrayList<>(nums), expr + "/" + num, result);
            nums.add(0, num);
        }

        private static int evaluateExpression(String expression) {
            return evaluateExpression(expression.split(""));
        }

        private static int evaluateExpression(String[] tokens) {
            int result = Integer.parseInt(tokens[0]);
            for (int i = 1; i < tokens.length; i += 2) {
                int num = Integer.parseInt(tokens[i + 1]);
                switch (tokens[i]) {
                    case "+":
                        result += num;
                        break;
                    case "-":
                        result -= num;
                        break;
                    case "*":
                        result *= num;
                        break;
                    case "/":
                        result /= num;
                        break;
                }
            }
            return result;
        }
    }

