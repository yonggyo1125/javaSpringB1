package exam02;

public class Schedule {
    private int year;
    private int month;
    private int day;

    public void setYear(int year) {
        this.year = year;
    }

    public int getYear() {
        return year;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getMonth() {
        return month;
    }

    public void setDay(int day) {
        if (month == 2 && day > 28) {
            day = 28;
        }

        this.day = day;
        //
    }

    public int getDay() {
        return day;
    }

    @Override
    public String toString() {
        return "Schedule{" +
                "year=" + year +
                ", month=" + month +
                ", day=" + day +
                '}';
    }
}
