import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println(getUserInputFromScanner());

    }

    public static int getUserInputFromScanner() {
        Scanner scanner = new Scanner(System.in);

        int count = 0;
        int sum = 0;
        boolean isCountEqualsFive = false;

        do {
            System.out.println("Enter number #" + (count + 1) + ": ");
            try {
                int userInput = Integer.parseInt(scanner.nextLine());
                sum += userInput;
                count++;
                if(count == 5) {
                    isCountEqualsFive = true;
                }
            } catch(NumberFormatException e) {
                System.out.println("Invalid number");
            }

        } while(!isCountEqualsFive);

        scanner.close();

        return sum;
    }

}
