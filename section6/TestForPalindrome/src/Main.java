public class Main {

    public static void main(String[] args) {

        numberToWords(0);
        System.out.println();
        numberToWords(1);
        System.out.println();
        numberToWords(1000);
        System.out.println();
        numberToWords(1234);


    }

        public static void numberToWords(int number) {
            if(number < 0) {
                System.out.println("Invalid Value");
            } else if(number == 0) {
                System.out.println("Zero");
            } else {

                int digitCount = getDigitCount(number);
                int reversedNumber = reverse(number);
                int lastDigit = 0;
                int counter = 0;

                while(reversedNumber > 0) {
                    lastDigit = reversedNumber % 10;
                    reversedNumber /= 10;
                    counter++;

                    switch(lastDigit) {
                        case 0:
                            System.out.println("Zero");
                            break;
                        case 1:
                            System.out.println("One");
                            break;
                        case 2:
                            System.out.println("Two");
                            break;
                        case 3:
                            System.out.println("Three");
                            break;
                        case 4:
                            System.out.println("Four");
                            break;
                        case 5:
                            System.out.println("Five");
                            break;
                        case 6:
                            System.out.println("Six");
                            break;
                        case 7:
                            System.out.println("Seven");
                            break;
                        case 8:
                            System.out.println("Eight");
                            break;
                        case 9:
                            System.out.println("Nine");
                            break;
                    }
                }
                if(digitCount != counter) {
                    for(int i = 1; i <= (digitCount - counter); i++) {
                        System.out.println("Zero");
                    }
                }
            }
        }

        public static int reverse(int number) {
            int originalNumber = number;
            number = (number > 0) ? number : (number * (-1));
            int reversedNumber = 0;

            while(number > 0) {
                reversedNumber += (number % 10);
                number /= 10;
                if(number > 0) {
                    reversedNumber *= 10;
                }
            }

            return ((originalNumber > 0) ? reversedNumber : (reversedNumber * (-1)));
        }

        public static int getDigitCount(int number) {
            if(number < 0) {
                return -1;
            } else if(number == 0) {
                return 1;
            }

            int counter = 0;

            while(number > 0) {
                number /= 10;
                counter++;
            }

            return counter;
        }
}
