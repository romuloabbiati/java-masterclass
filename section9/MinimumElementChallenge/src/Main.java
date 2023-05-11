import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int[] integers = readIntegers();
        System.out.println(Arrays.toString(integers));

        int min = findMin(integers);
        System.out.println("min = " + min);

    }

    private static int[] readIntegers() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Type in the console a comma delimited list of integers: ");
        String listOfIntegers = scanner.nextLine();

        String[] stringOfIntegers = listOfIntegers.split(",");
        int[] integers = new int[stringOfIntegers.length];

        for(int i = 0; i < stringOfIntegers.length; i++) {
            integers[i] = Integer.parseInt(stringOfIntegers[i].trim());
        }

        return integers;
    }

    private static int findMin(int[] array) {
        int min = 0;
        boolean flag = true;

        for(int number : array) {
            if(flag) {
                min = number;
                flag = false;
            }
            if(number < min) {
                min = number;
            }
        }
        return min;
    }

}
