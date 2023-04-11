package Demo04.Demo0410;

public class Homework041004 {
    //1、54张扑克牌去掉大小王2张牌，剩余52张。任意发1－K之间的4个张牌(也就是有1-13的四个数字)，用＋－＊／（）连结成算式，使得式子的计算结果为24
    public static void main(String[] args) {
        String[] str = {"黑桃","紅心","方塊","梅花"};
        int[] num = {1,2,3,4,5,6,7,8,9,10,11,12,13};
        Calculator calculator = new Calculator();
        for(int i=0; i<13; i++){
            for(int j=0; j<13; j++){
                if(calculator.plus(num[i],num[j])==24){
                    System.out.println("數字相加:a="+num[i]+" b="+num[j]);
                }
                if(calculator.reduce(num[i],num[j])==24){
                    System.out.println("數字相減:a="+num[i]+" b="+num[j]);
                }
                if(calculator.take(num[i],num[j])==24){
                    System.out.println("數字相乘:a="+num[i]+" b="+num[j]);
                }
                if(calculator.remove(num[i],num[j])==24){
                    System.out.println("數字相除:a="+num[i]+" b="+num[j]);
                }
            }
        }
    }
}
class Calculator {
    int plus(int a,int b){
        return a+b;
    }
    int reduce(int a,int b){
        return a-b;
    }
    int take(int a,int b){
        return a*b;
    }
    int remove(int a,int b){
        return a/b;
    }
}