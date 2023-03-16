public class HomeWork04 {
    public static void main(String[] args) {
        System.out.println("1-100之间完数:");
        for (int i = 1; i <= 100 ; i++) {
            int sum = 0;//sum是约数之和
            for (int j = 1; j < i ; j++) {//约数的范围是1到i自身减1
                if(i % j == 0){//判断j是不是约数
                    sum += j;
                }
            }
            if(sum == i){//判断i是不是完全数
                System.out.println(i + " ");
            }
        }
    }
}
