public class Main {

    public static void main(String[] args) {

        int sum = sumDigits(125);
        System.out.println("sum = " + sum);
        System.out.println();

        sum = sumDigits(1000);
        System.out.println("sum = " + sum);
        System.out.println();

        sum = sumDigits(7);
        System.out.println("sum = " + sum);
        System.out.println();

        sum = sumDigits(1234);
        System.out.println("sum = " + sum);
        System.out.println();

        sum = sumDigits(-125);
        System.out.println("sum = " + sum);

    }

    public static int sumDigits(int number) {
        int sum = 0;

        if(number < 0) {
            return -1;
        }

        while(number > 9) {
            sum += (number % 10);
            number /= 10;
        }
        sum += number;
        return sum;
    }

}
