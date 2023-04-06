package day22;

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

    public void setYear(int year) {
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public boolean isLeapYear() {
        return (year % 4 == 0 && year % 100 != 0) || year % 400 == 0;
    }

    public int getDaysBetween(Date date) {
        int days = 0;
        Date startDate, endDate;
        if (this.compareTo(date) <= 0) {
            startDate = this;
            endDate = date;
        } else {
            startDate = date;
            endDate = this;
        }
        while (startDate.year < endDate.year || startDate.month < endDate.month || startDate.day < endDate.day) {
            days++;
            startDate.nextDay();
        }
        return days;
    }

    public int compareTo(Date date) {
        if (this.year != date.year) {
            return this.year - date.year;
        } else if (this.month != date.month) {
            return this.month - date.month;
        } else {
            return this.day - date.day;
        }
    }

    public void nextDay() {
        int maxDay = getMaxDayOfMonth();
        if (day < maxDay) {
            day++;
        } else if (month < 12) {
            month++;
            day = 1;
        } else {
            year++;
            month = 1;
            day = 1;
        }
    }

    private int getMaxDayOfMonth() {
        if (month == 2) {
            return isLeapYear() ? 29 : 28;
        } else if (month == 4 || month == 6 || month == 9 || month == 11) {
            return 30;
        } else {
            return 31;
        }
    }
}
