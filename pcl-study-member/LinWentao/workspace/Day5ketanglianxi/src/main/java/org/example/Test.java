package org.example;

public class Test {
    public static void main(String[] args) {
        int[] arr= new int[]{3,4,5};
        int[] arr2={1,2};
        System.out.println("======"
        );

        int a1=0;
        int b1=0;
        for (int x:arr2) {
            //++在前 先用原来值运算 再+1
            //++在后 先+1 再运算
        }
            int out = arr[a1++];
            int out2= arr[++b1];
            System.out.println("a1++"+out);
            System.out.println("b1"+out2);




    }
}
