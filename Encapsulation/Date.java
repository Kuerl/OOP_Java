package Encapsulation;

public class Date {
    private int day, month, year;
    
    public Date(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }
    //get
    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }
    //set
    public void setDay(int day) {
        this.day = day;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public void display() {
        if(day<10) System.out.print("0"+day+"/");
        else System.out.print(day+"/");

        if(month<10) System.out.print("0"+month+"/");
        else System.out.print(month+"/");

        System.out.println(year);
    }
}
