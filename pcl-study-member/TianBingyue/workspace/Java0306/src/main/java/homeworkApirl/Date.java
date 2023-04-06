package homeworkApirl;

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

    public int cha(int newYear, int newMonth, int newDays) {
        int miss = 0;
        int months[] = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30};
        int old11Day = 0;
        int new11Day = 0;

        while (this.year < newYear) {
            if (this.year % 4 == 0 && this.year % 100 != 0) {
                miss += 365;
            } else {
                miss += 366;
                ;
            }
            this.year++;
        }
        for (int i = 0; i < this.month; i++) {
            if (this.year % 4 == 0 && this.year % 100 != 0) {
                months[2] = 29;
            } else {
                months[2] = 28;
            }
            old11Day += months[i];
        }
        old11Day += newDays;
        return miss - old11Day+new11Day;
    }
}

