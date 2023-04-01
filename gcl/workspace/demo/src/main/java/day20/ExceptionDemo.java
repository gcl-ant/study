package day20;

public class ExceptionDemo {
    public static void main(String[] args) {
        // 数学异常
        try {
            int result = 10 / 0; // 尝试除以0
        } catch (ArithmeticException e) {
            System.out.println("发生了数学异常: " + e.getMessage());
        } finally {
            System.out.println("处理完数学异常");
        }

        // 空指针异常
        try {
            String str = null;
            System.out.println(str.length());
        } catch (NullPointerException e) {
            System.out.println("发生了空指针异常: " + e.getMessage());
        } finally {
            System.out.println("处理完空指针异常");
        }

        // 数字格式异常
        try {
            String str = "abc";
            int num = Integer.parseInt(str);
        } catch (NumberFormatException e) {
            System.out.println("发生了数字格式异常: " + e.getMessage());
        } finally {
            System.out.println("处理完数字格式异常");
        }

        // 索引越界异常
        try {
            int[] arr = {1, 2, 3};
            System.out.println(arr[3]);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("发生了索引越界异常: " + e.getMessage());
        } finally {
            System.out.println("处理完索引越界异常");
        }

        // 类型转换异常
        try {
            Object obj = new Object();
            String str = (String) obj;
        } catch (ClassCastException e) {
            System.out.println("发生了类型转换异常: " + e.getMessage());
        } finally {
            System.out.println("处理完类型转换异常");
        }
    }
}
