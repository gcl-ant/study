package D0405题目;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
public class Date {
    private int year;
    private int month;
    private int day;

    public Date(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public int getYear() {
        return year;
    }

    public int getMonth() {
        return month;
    }

    public int getDay() {
        return day;
    }

    public long daysbetween(Date otherDate) { //int类型报错 provided long
        LocalDate date1 = LocalDate.of(year, month, day);
        LocalDate date2 = LocalDate.of(otherDate.getYear(), otherDate.getMonth(), otherDate.getDay());
        long daysbetween = ChronoUnit.DAYS.between(date1, date2);
        return ChronoUnit.DAYS.between(date1, date2);
    }

        /*1. ChronoUnit  Java 8日期时间API
          ChronoUnit.DAYS表示天数单位，
          ChronoUnit.HOURS表示小时单位
          ChronoUnit.YEARS  年
          ChronoUnit.MONTHS  月
          ChronoUnit.WEEKS 星期

          2. ChronoUnit类还提供了一些常用的方法，例如：
          between()方法：计算两个时间点之间的差异，返回一个long类型的值。 .plus()
          addTo()方法：将指定的时间量添加到指定的日期时间对象中，返回一个修改后的新对象。
        */

}
