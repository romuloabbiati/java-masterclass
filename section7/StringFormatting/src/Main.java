public class Main {

    public static void main(String[] args) {

        // the most common escape sequences in Java
        // \n to insert a new line character
        // \t insert a tab character
        // \" insert a double quote character
        // \\ insert a backslash character

        String bulletIt = "Print a bulleted list:\n" +
                "\t\u2022 First Point\n" +
                "\t\t\u2022 Second Point";

        System.out.println(bulletIt);

        String textBlock = """
                Print a bulleted list:
                    \u2022 First Point
                        \u2022 Second Point
                """;
        System.out.println(textBlock);

        int age = 36;
        System.out.printf("Your age is %d%n", age);

        int yearOfBirth = 2023 - 36;
        System.out.printf("Age = %d, Birth year = %d%n", age, yearOfBirth);

        System.out.printf("Your age is %.2f%n", (float) age);

        for(int i = 1; i <= 100000; i *= 10) {
            System.out.printf("Printing %6d %n", i);
        }

        String formattedString = String.format("Your age is %d", age);
        System.out.println(formattedString);

        formattedString = "Your age is %d" .formatted(age);
        System.out.println(formattedString);

    }

}
