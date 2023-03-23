package day07;

public class homework04 {
    public static void main(String[] args) {
        int a3;
        int b3;
        for (int i3 = 1; i3 <= 100; i3++) {
            for (int j3 = 1; j3 <= i3; j3++) {
                if (i3 % j3 == 0) {
                    b3 = j3;
                    a3 = 0 + b3;
                    if (i3 % j3 == 0 && i3 != j3) {
                        break;
                    }
                    if (a3 == i3) {
                        System.out.println(i3 + "是完美数");
                    }

                    }
                }
            }
        }
        }
