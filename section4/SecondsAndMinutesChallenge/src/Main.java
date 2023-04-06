public class Main {

    public static void main(String[] args) {

        getDurationString(60); // 1 min
        System.out.println();
        getDurationString(120); // 2 min
        System.out.println();
        getDurationString(121); // 2 min 1 second
        System.out.println();
        getDurationString(3600); // 1 hour 0 min 0 seconds
        System.out.println();
        getDurationString(3660); // 1 hour 1 min 0 seconds
        System.out.println();
        getDurationString(3780); // 1 hour 3 min 0 seconds
        System.out.println();
        getDurationString(3796); // 1 hour 3 min 16 seconds
        System.out.println();
        System.out.println(getDurationString(3945));
        System.out.println();
        System.out.println(getDurationString(-3945));

    }

    public static String getDurationString(int seconds) {
        String result;
        if(seconds < 0) {
            return result = "The value passed as a seconds needs to be greater than or equal to zero!";
        }
        int minutes = seconds / 60;
        System.out.println("getDurationString1: minutes -> " + minutes);
        seconds = seconds % 60;
        System.out.println("getDurationString1: seconds -> " + seconds);
        result = getDurationString(minutes, seconds);
        System.out.println("getDurationString1: result -> " + result);

        return result;
    }

    public static String getDurationString(int minutes, int seconds) {
        String result;
        if(minutes < 0 || (seconds < 0 || seconds > 59)) {
            return result = "Minutes need to be greater than or equal to zero and seconds greater than " +
                    "or equal to zero and less than 60!";
        }
        int hours = minutes / 60;
        System.out.println("getDurationString2: hours -> " + hours);
        minutes = minutes % 60;
        System.out.println("getDurationString2: minutes -> " + minutes);
        result = hours + "h " + minutes + "m " + seconds + "s";
        System.out.println("getDurationString2: result -> " + result);

        return result;
    }

}
