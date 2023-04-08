package day25;

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

    public int daysBetween(Date other) {
        LocalDate date1 = LocalDate.of(year, month, day);
        LocalDate date2 = LocalDate.of(other.getYear(), other.getMonth(), other.getDay());
        return Math.abs((int) ChronoUnit.DAYS.between(date1, date2));
    }
}

