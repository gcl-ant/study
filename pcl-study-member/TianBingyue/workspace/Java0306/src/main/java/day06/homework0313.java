package day06;

public class homework0313 {public static void main(String[] args) {
//判断一个整数是几位数，逆序输出
    int i = 12349;
    int n = 10;
    int b =1;
    if(i<n){
        System.out.println(b+"位数");
    }
//    else if(i<n*10){continue;
//        System.out.println(b++ +"位数");
//    }
    String is=String.valueOf(i);
    for(int ii=is.length() - 1;ii>=0;ii--){
        System.out.println(is.charAt(ii));
    }

    //2000-3000年中的闰年
    for(int i2=2000;i2<=3000;i2++){
//    for(int i2;2000<=i2<=3000;i2++){
        if(i2%4!=0&&i2%100!=0)    //如何加入两个条件？
        {
                    continue;
        }
        System.out.println("闰年："+i2);
    }


}
}
