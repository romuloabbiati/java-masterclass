public class Main {

    public static void main(String[] args) {

        for(int i = 1; i <= 5; i++) {
            Student student = new Student(
                    "S92300" + i,
                    switch(i) {
                        case 1 -> "Isabela";
                        case 2 -> "Romulo";
                        case 3 -> "Anna";
                        case 4 -> "Rosinella";
                        case 5 -> "Rafael";
                        default -> "Anonymous";
                    },
                    "20/03/1991",
                    "Java Masterclass"
            );
            System.out.println(student);
        }

    }

}
