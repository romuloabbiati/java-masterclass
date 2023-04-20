public class Main {

    public static void main(String[] args) {

        for(int i = 1; i <= 5; i++) {
            RecordStudent student = new RecordStudent(
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

        Student pojoStudent = new Student("S923006", "Silvio",
                "20/03/1991", "Java Masterclass");

        RecordStudent recordStudent = new RecordStudent("S923007", "Rafaella",
                "20/03/1991", "Java Masterclass");

        System.out.println(pojoStudent);
        System.out.println(recordStudent);

        pojoStudent.setClassList(pojoStudent.getClassList() + ", Java OCP Exam 829");
//        recordStudent.setClassList(recordStudent.classList() + ", Java OCP Exam 829"); there is no setter methods
        // for Record classes. Record classes were built to be IMMUTABLE

        System.out.println(pojoStudent.getName() + " is taking " + pojoStudent.getClassList());
        System.out.println(recordStudent.name() + " is taking " + recordStudent.classList());
    }

}
