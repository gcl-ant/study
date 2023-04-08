package day24;

import java.text.MessageFormat;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Test2 {
    public static void main(String[] args) {
        //用当前日期生成LocalTime
        LocalTime time1=LocalTime.now();
        System.out.println("time1: "+time1);
//使用指定数字生成LocalTime
        LocalTime time2=LocalTime.of(20, 12, 9);
        System.out.println("time2: "+time2);
//返回各字段值
        System.out.println("时："+time2.getHour()+" 分："+time2.getMinute()+" 秒："+time2.getSecond());
//将字符串转换
        String str="12:34:09";
        LocalTime time3=LocalTime.parse(str);
        System.out.println("time3: "+time3);


        //用当前日期生成LocalDateTime
        LocalDateTime dateTime1=LocalDateTime.now();
        System.out.println("dateTime1: "+dateTime1);
//使用指定数字生成LocalDateTime
        LocalDateTime dateTime2=LocalDateTime.of(20, 12, 9,12,23,4);
        System.out.println("dateTime2: "+dateTime2);
//返回各字段值
        System.out.println("时："+dateTime2.getHour()+" 分："+dateTime2.getMinute()+" 秒："+dateTime2.getSecond());
//将字符串转换
        String str2="2009-12-12T12:34:09";
        LocalDateTime dateTime3=LocalDateTime.parse(str2);
        System.out.println("dateTime3: "+dateTime3);


        //创建pattern
        String pattern="{0}顾客您好，应付金额{1,number,currency}";
        System.out.println(MessageFormat.format(pattern, new Object[]{"Alice",Math.round(134.8)}));
        System.out.println(MessageFormat.format(pattern, new Object[]{"章紫",Math.round(4334.1)}));

    }
}
