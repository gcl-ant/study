package Demo03.Demo0313;

public class Homework0313 {

    public static void main(String[] args) {
//    作业1：
//    题目：有一对兔子，从出生后第3个月起每个月都生一对兔子，小兔子长到第三个月后每个月又生一对兔子。假如兔子都不死，要求输出一年内兔子的数量是多少。
//    考点：流程控制
//    难度：中
//    System.out.println("-----作業一-----");
//        int a = 0;
//        System.out.print("1月2隻,");
//        for (int b = 2 ; b <= 12 ; b++) {
//            if (b <= 3){
//                a = a + 2;
//            } else {
//                a = a + (b - 3) * 2;
//            }
//            System.out.print(b + "月" + a + "隻,");
//        }
//    作业2：
//    题目：判断10-105之间有多少个素数，并输出所有素数。【素数又称为质数，定义为在大于1的自然数中，除了1和它本身以外不再有其他因数的数】
//    考点：流程控制、运算符
//    难度：中
    System.out.println("");
    System.out.println("-----作業二-----");
    System.out.print("質數=");
//        for (int c = 10 ; c <= 105 ; c++) {
//            if ( c%2 > 0 ){
//                int d = c;
//                if ( d%3 > 0 ){
//                    int e = d;
//                    if ( e%5 > 0 ){
//                        int f = e;
//                        if (f%7 > 0){
//                            int g = f;
//                            System.out.print(g+",");
//                        }
//                    }
//                }
//            }
//        }
        for (int num = 10 ; num <= 105 ; num++) {
            if ( num%2 > 0 && num%3 > 0 && num%5 > 0 && num%7 > 0){
                System.out.print(num+" ");
            }
        }
//    作业3：
//    题目：判断100到500之间，哪些数是水仙花数。【水仙花数是指一个 n 位正整数 ( n≥3 )，它的每个位上的数字的 n 次幂之和等于它本身。（例如：1^3 + 5^3+ 3^3 = 153）】
//    考点：流程控制、运算符
//    难度：中
    System.out.println("");
    System.out.println("-----作業三-----");
//            for (int h = 0 ; h <= 9 ; h++){
//                for (int i = 0 ; i <= 9 ; i++){
//                    for (int j = 0 ; j <= 9 ; j++){
//                        if ( 500 >= h*h*h + i*i*i + j*j*j & h*h*h + i*i*i + j*j*j >=100){
//                            int k = h*h*h + i*i*i + j*j*j;
//                            if ( k == h*100 + i*10 +j){
//                                int l = k;
//                            System.out.print(l + ",");
//                            }
//                        }
//                    }
//                }
//            }
            for (int hun = 0 ; hun <= 5; hun++){
                for (int ten = 0 ; ten <= 9 ; ten++){
                    for (int dig = 0 ; dig <= 9 ; dig++){
                        int hana = hun*hun*hun + ten*ten*ten + dig*dig*dig;
                        if ( 500 >= hana && 100 <= hana && hana == hun*100 + ten*10 + dig){
                            System.out.println("水仙花數=" +hana);
                            }
                        }
                    }
                }
//    作业4：
//    题目：求1-100之间，有哪些数是完数。【完全数（Perfect number），又称完美数或完备数，是一些特殊的自然数。它所有的真因子（即除了自身以外的约数）的和（即因子函数），恰好等于它本身。例如：6=1+2+3】
//    考点：流程控制、运算符
//    难度：中
    System.out.println("-----作業四-----");
    //Math.pow(10, 2);10的2次方 stuvwxyz Math.pow(2, s) * (Math.pow(2, t) - 1);
//        for (int aa = 1 ; aa <= 10 ; aa++){
//            int[] bb = {2,3,5,7,11};
//            for (int cc:bb){
//                double kan = Math.pow(2, aa) * (Math.pow(2, cc) - 1);
//                if (100 >= kan && kan >= 1){
//                    double w = kan;
//                    double y = 0;
//                    for (double x = 1 ; y <= 100 ; x++){
//                        y = y + x;
//                        if ( y == w){
//                            double z = y;
//                            System.out.println("完數=" +z);
//                        }
//                    }
//                }
//            }
//        }
        for (int aa = 1 ; aa <= 10 ; aa++){
            int[] bb = {2,3,5,7,11};
            for (int cc:bb){
                double kan = Math.pow(2, aa) * (Math.pow(2, cc) - 1);
                if (100 >= kan && kan >= 1){
                    double per = 0;
                    for (double x = 1 ; per <= 100 ; x++){
                        per = per + x;
                        if ( per == kan){
                            System.out.println("完數=" + per);
                        }
                    }
                }
            }
        }
        int num = 0;
        for(int i = 1 ; i <= 100 ; i++ ) {
            for(int j = 1 ; j < i ; j++ ) {
                if( i % j == 0 ) {
                    num = num + j;
                }
            }
            if( i == num ) {
                System.out.println(i);
            }
            num = 0;
        }
//    作业5：
//    题目：判断一个整数是几位数，并按照逆序输出。
//    考点：流程控制、运算符、数组
//    难度：中
    System.out.println("-----作業五-----");
        int p = 123456;
        String q = String.valueOf(p);
        System.out.println(q.length()+"位數");
//        int[] i1 = new int[i02.length()];
//        String[] str2 = {str1};
        for (int r = q.length()-1; r >= 0 ; r--){
            System.out.print(q.charAt(r));
        }
//        降序??
//        Arrays.sort(a,Collections.reverseOrder());
//        int[] intArr = {1,3,5,7,9};
//        for (int i = 0; i < intArr.length; i++){
//            System.out.println(intArr[i]);
//        }
//    作业6：
//    题目：输出2000年到3000年中的闰年。
//    考点：流程控制、运算符
//    难度：中
//    System.out.println("");
//    System.out.println("-----作業六-----");
//    System.out.println("閏年：");
//        for (int m = 2000 ; m <= 3000 ; m++){
//            if ( m % 4 == 0 ){
//                int n = m;
//                if ( n % 100 > 0){
//                    int o = n;
//                    System.out.println(o);
//                } else if( n % 400 == 0){
//                    int o = n;
//                    System.out.println(o);
//                }
//            }
//        }
//        int endYear = 3000;
//        for (int year = startYear; year <= endYear; year++) {
//            if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
//                System.out.println(year + " 是閏年。");
    }
}