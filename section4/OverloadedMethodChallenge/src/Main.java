public class Main {

    public static void main(String[] args) {
        double inchesToCentimeters = convertToCentimeters(2);
        System.out.println("Inches to centimeters = " + inchesToCentimeters);

        double feetAndInchesToCentimeters = convertToCentimeters(5, 11);
        System.out.println("Feet and inches to centimeters = " + feetAndInchesToCentimeters);
    }

    public static double convertToCentimeters(int heightInInches) {
        return heightInInches * 2.54;
    }

    public static double convertToCentimeters(int heightInFeet, int heightInInches) {
        int heightFromFeetToInches = heightInFeet * 12;
        int totalInches = heightFromFeetToInches + heightInInches;
        return convertToCentimeters(totalInches);
    }

}
