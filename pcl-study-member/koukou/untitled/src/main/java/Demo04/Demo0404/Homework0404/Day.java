package Demo04.Demo0404.Homework0404;

//import java.time.ZonedDateTime;
//import java.time.Duration;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Day {
    public static void main(String[] args) {
//        ZonedDateTime now = ZonedDateTime.now();
//        ZonedDateTime then = now.minusMonths(1).minusDays(10)
//                .minusMinutes(5).minusSeconds(40);
//
//        Duration duration = Duration.between(then, now);
//
//        System.out.println(duration);
//        System.out.println(duration.getSeconds());
//        System.out.println(duration.toMinutes());
//        System.out.println(duration.toHours());
//        System.out.println(duration.toDays());

        String d1 = "2023-04-06";
        String d2 = "2023-04-01";

        String pattern = "yyyy-MM-dd";
        SimpleDateFormat sdf = new SimpleDateFormat(pattern);

        try {
            Date date1 = sdf.parse(d1);
            Date date2 = sdf.parse(d2);

            // 以分鐘為單位獲取兩個日期之間的差異
            long elapsedms = date1.getTime() - date2.getTime();
            long diff = TimeUnit.DAYS.convert(elapsedms, TimeUnit.MILLISECONDS);
            System.out.println(diff);
        }
        catch (ParseException e) {
            e.printStackTrace();
        }
    }
}