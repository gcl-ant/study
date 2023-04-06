package apr06;

import java.time.LocalDate;
import static java.time.temporal.ChronoUnit.DAYS;

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
    public int getDaysBetween(Date otherDate) {
        LocalDate date1 = LocalDate.of(year, month, day);
        LocalDate date2 = LocalDate.of(otherDate.getYear(), otherDate.getMonth(), otherDate.getDay());
        return Math.abs((int) DAYS.between(date1, date2));
    }

}
