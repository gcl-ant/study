package day24;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

public class Test {
    public static void main(String[] args) {
        Date date1 = new Date();
        System.out.println(date1);

        //使用有参构造方法创建Date对象
        Date date2 = new Date(10 * 24 * 60 * 60 * 1000);
        System.out.println(date2);

        //用当前的毫秒数构建Date
        Date date3 = new Date(System.currentTimeMillis());
        System.out.println(date3);

        //使用默认时区和语言环境获得日历对象
        Calendar calendar1 = Calendar.getInstance();

        //使用指定时区和语言环境获得日历对象
        Calendar calendar2 = Calendar.getInstance(TimeZone.getTimeZone("America/-"), Locale.CHINA);


        System.out.println(calendar2.toString());

        //创建SimpleDateFormat对象，使用不同的格式
        SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy年MM月dd日hh时mm分ss秒");
        SimpleDateFormat sdf2 = new SimpleDateFormat("MM-dd-yyyy hh:mm:ss", Locale.US);

//		创建日期对象，得到当前时间
        Date date = new Date();

//		创建日历对象，指定时间为 2017-3-21 10:52:24
        Calendar cal = Calendar.getInstance();
        cal.set(2023, 4, 7, 20, 01, 59);

//		将日期对象进行格式化输出
        System.out.println(sdf1.format(date));
        System.out.println(sdf2.format(date));

//		将日历对象用getTime方法转换成Date对象，使用format格式化
        System.out.println(sdf1.format(cal.getTime()));
        System.out.println(sdf2.format(cal.getTime()));

        SimpleDateFormat sdf3 = new SimpleDateFormat("yyyy年MM月dd日hh时mm分ss秒");
        //字符串str1表示时间信息
        String str1 = "2024年5月1日8时12分9秒";
        try {
            //使用SimpleDateFormat类的parse方法，把字符串转换成Date类型对象
            Date date4 = sdf3.parse(str1);
            System.out.println(date4);
        } catch (ParseException e) {
            e.printStackTrace();
        }

        //用当前日期生成LocalDate
        LocalDate localDate1 = LocalDate.now();
        System.out.println(localDate1);

        //使用指定数字生成LocalDate
        LocalDate localDate2 = LocalDate.of(2023, 12, 9);
        System.out.println(localDate2);

        //返回各字段值
        System.out.println("年：" + localDate1.getYear() + " 月："
                + localDate1.getMonthValue() + " 日："
                + localDate1.getDayOfMonth());
        //将字符串转换
        String str = "20230912";
        DateTimeFormatter df4 = DateTimeFormatter.ofPattern("yyyyMMdd");
        LocalDate localDate3 = LocalDate.parse(str,df4);
        DateTimeFormatter df5 = DateTimeFormatter.ofPattern("yyyy年MM月dd日");
        System.out.println("date3: " + localDate3.format(df5));

        Integer[] integers = new Integer[]{1,2,3,45};
        StudentCalc.printvalue(integers);

    }
}
