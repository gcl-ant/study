public class Mar11th {
    public static void main(String[] args) {
        String str1 = "Tian";
        String str2 = "Tian";
        String str3 = new String("Jiyun");
        String str4 = new String("Jiyun");
        System.out.println(str1 == str2);
        System.out.println(str3 == str4);

        int i1 = 10;
        int i2 = 10;
        Integer i01 = i1;
        Integer i02 = i2;
        int n1 = i01;
        int n2 = i02;

        int[] arr11 = {1, 2, 3};
        int[] arr12= new int[]{1, 2, 3};
        int[] arr13= new int[3];
        arr13[0] = 1;
        arr13[1] = 2;
        arr13[2] = 3;
        int[][] arr2 =new int[][]{{0, 1, 2}, {5, 6,7}};

    }
}
