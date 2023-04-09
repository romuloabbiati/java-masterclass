public class Main {

    public static void main(String[] args) {

        int evenNumberCounter = 0;
        int oddNumberCounter = 0;
        int number = 4;
        int finishNumber = 20;
        while(number <= finishNumber) {
            number++;
            if(!isEvenNumber(number)) {
                oddNumberCounter++;
                continue;
            }
            evenNumberCounter++;
            System.out.println("Even Number " + number);
            if(evenNumberCounter == 5) {
                break;
            }
        }
        System.out.println("Even numbers: " + evenNumberCounter);
        System.out.println("Odd nubmers: " + oddNumberCounter);

    }

    public static boolean isEvenNumber(int number) {
        if(number % 2 == 0) {
            return true;
        }
        return false;
    }

}
