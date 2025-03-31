public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        Date d = new Date(31,3, 2025);
    }
}

class Date {
    int day;
    int month;
    int year;


    Date(int day, int month, int year){
        this.day = day;
        this.month = month;
        this.year = year;
    }
}