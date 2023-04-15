import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int count = 0;

        System.out.println("Type numbers to know which one are the " +
                "min and max ones (type any letter to end the app):");
        while(true) {
            System.out.println("Enter number #" + (count + 1) + ":");
            String userInput = scanner.nextLine();
            try {
                int number = Integer.parseInt(userInput);
                count++;
                if(number < min) {
                    min = number;
                }
                if(number > max) {
                    max = number;
                }

            } catch (NumberFormatException nft) {
                System.out.println("Invalid number");
                break;
            }
        }
        System.out.println("Min: " + min);
        System.out.println("Max: " + max);

        scanner.close();
    }

}
