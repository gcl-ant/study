package Demo03.Demo0316;

public class Homework031603 {
    public static void main(String[] args) {
        //求1-100之间，有哪些数是完数。
        for (int i3 = 1; i3 <= 100000; i3++) {
            int sum = 0;
            for (int j3 = 1; j3 < i3; j3++) {
                if (i3 % j3 == 0) {
                    sum += j3;
                }
            }
            if (sum == i3) {
                System.out.println(i3 + "是完美数");
            }
        }

//        for (int aa = 1 ; aa <= 10 ; aa++){
//            int[] bb = {2,3,5,7,11};
//            for (int cc:bb){
//                int kan =Double.valueOf(Math.pow(2, aa) * (Math.pow(2, cc) - 1)).intValue();
//                if (100000 >= kan && kan >= 1){
//                    int per = 0;
//                    for (int x = 1 ; per <= 100000 ; x++){
//                        per = per + x;
//                        if ( per == kan){
//                            System.out.println("完數=" + per);
//                        }
//                    }
//                }
//            }
//        }

        for (int i = 1; i <= 100; i++) {
            if (isPerfectNumber(i)) {
                System.out.print(i + " ");
            }
        }
    }

    // 判断一个数是否为完数
    public static boolean isPerfectNumber(int n) {
        int sum = 0;
        for (int i = 1; i < n; i++) {
            if (n % i == 0) {
                sum += i;
            }
        }
        return sum == n;
    }
}
