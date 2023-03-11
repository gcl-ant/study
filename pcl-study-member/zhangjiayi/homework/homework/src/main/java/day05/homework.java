package day05;

public class homework {
    public static void main(String[] args) {
        System.out.println("作业1");
        String str1= "1";
        String str2= new String("1");
        String str3= "1";
        System.out.println(str1==str2);
        System.out.println(str1==str3);

        System.out.println("作业3");
        System.out.println("自动装箱");
        int[] int1 = {1,2,3};
        for (Integer item1:int1){
            System.out.println(item1);
        }
        System.out.println("自动拆箱");
        Integer[] Intarr1 = {1,2,3};
        for (int item2:Intarr1) {
            System.out.println(item2);
        }

        System.out.println("作业4");
        int[] int2 = {1,2,3};
        int[] arr2= new int [3];
        arr2[0] = 1;
        arr2[1] = 2;
        arr2[2] = 3;
        int[] arr3 = new int[]{1,2,3};
        int[][] int3=new int[2][3];
        int3[0][0]=1;
        int3[0][1]=2;
        int3[0][2]=3;
        int3[1][0]=11;
        int3[1][1]=12;
        int3[1][2]=13;
        for (int[] itemOut:int3){
            for (int itemIn: itemOut){System.out.println(itemIn);
            }
        }
    }
}
