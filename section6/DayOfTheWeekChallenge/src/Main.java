public class Main {

    public static void main(String[] args) {

        printDayOfWeek(0);
        printDayOfWeek(1);
        printDayOfWeek(2);
        printDayOfWeek(3);
        printDayOfWeek(4);
        printDayOfWeek(5);
        printDayOfWeek(6);
        printDayOfWeek(7);

    }

    public static void printDayOfWeek(int day) {
        String dayOfWeek = switch(day) {
            case 0 -> "Sunday";
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3 -> "Wednesday";
            case 4 -> "Thursday";
            case 5 -> "Friday";
            case 6 -> "Saturday";
            default -> "Invalid day";
        };
        System.out.println(day + " stands for " + dayOfWeek);
    }

    public static void printWeekDay(int day) {
        if(day == 0) {
            System.out.println(day + " is Sunday");
        } else if(day == 1) {
            System.out.println(day + " is Monday");
        } else if(day == 2) {
            System.out.println(day + " is Tuesday");
        } else if(day == 3) {
            System.out.println(day + " is Wednesday");
        } else if(day == 4) {
            System.out.println(day + " is Thursday");
        } else if(day == 5) {
            System.out.println(day + " is Friday");
        } else if(day == 6) {
            System.out.println(day + " is Saturday");
        } else {
            System.out.println("Invalid day");
        }
    }

}
