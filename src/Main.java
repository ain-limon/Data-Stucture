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

//    boolean isValidDate(){
//        boolean
//
//
//        return false;
//    }

    public boolean isValidDate() {
        if (year < 1 || month < 1 || month > 12 || day < 1) {
            return false;
        }
        int maxDays = 31;
        if (month == 4 || month == 6 || month == 9 || month == 11) {
            maxDays = 30;
        }
        else if (month == 2) {
            if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                maxDays = 29;
            } else {
                maxDays = 28;
            }
        }
        return day <= maxDays;
    }

}