package day20;

public class Test1 {
    public static void main(String[] args) {
        try {
            int a = 10 / 0; // 数学异常
        } catch (ArithmeticException e) {
            System.out.println("捕获到数学异常：" + e.getMessage());
        } finally {
            System.out.println("执行了 finally 语句块");
        }

        try {
            String str = null;
            str.length(); // 空指针异常
        } catch (NullPointerException e) {
            System.out.println("捕获到空指针异常：" + e.getMessage());
        } finally {
            System.out.println("执行了 finally 语句块");
        }

        try {
            String str = "abc";
            int num = Integer.parseInt(str); // 数字格式异常
        } catch (NumberFormatException e) {
            System.out.println("捕获到数字格式异常：" + e.getMessage());
        } finally {
            System.out.println("执行了 finally 语句块");
        }

        try {
            int[] arr = new int[3];
            arr[3] = 10; // 索引越界异常
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("捕获到索引越界异常：" + e.getMessage());
        } finally {
            System.out.println("执行了 finally 语句块");
        }

        try {
            Object obj = "abc";
            Integer i = (Integer) obj; // 类型转换异常
        } catch (ClassCastException e) {
            System.out.println("捕获到类型转换异常：" + e.getMessage());
        } finally {
            System.out.println("执行了 finally 语句块");
        }
    }
}

