public class Hello {

    public static void main(String[] args) {
        System.out.println("Hello, Tim");

        boolean isAlien = false;
        if(isAlien == false) {
            System.out.println("It is not an alien!");
            System.out.println("And I am scared of aliens");
        }

        int topScore = 80;
        if(topScore < 100) {
            System.out.println("You got the high score!");
        }

        int secondTopScore = 95;
        if((topScore > secondTopScore) && (topScore < 100)) {
            System.out.println("Greater than second top score and less than 100");
        }

        if((topScore > 90) || (secondTopScore <= 90)) {
            System.out.println("Either or both of the conditions are true");
        }

        int newValue = 50;
        if(newValue == 50) {
            System.out.println("This is an error");
        }

        boolean isCar = false;
        if(!isCar) {
            System.out.println("This is not supposed to happen");
        }

        String makeOfCar = "Volkswagen";
        boolean isDomestic = makeOfCar == "Volkswagen" ? false : true;

        if(isDomestic) {
            System.out.println("This car is domestic to our country");
        }

        String s = (isDomestic) ? "This car is domestic" : "This car is not domestic";
        System.out.println(s);

        double doubleVar = 20.00;
        double secondDoubleVar = 80.00;
        double result = (doubleVar + secondDoubleVar) * 100.00;
        double remainder = result % 40.00;
        boolean booleanVar = remainder == 0.00 ? true : false;
        System.out.println(booleanVar);
        if(!booleanVar) {
            System.out.println("got some remainder");
        }
    }

}
