public class Main extends Object {

    public static void main(String[] args) {

        Student student = new Student("Romulo", 36);
        System.out.println(student);

        PrimarySchoolStudent isabela = new PrimarySchoolStudent("Isabela", 8, "Elenir");
        System.out.println(isabela);

    }

}

class Student {
    private String name;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return name + " is " + age;
    }

    //    @Override
//    public String toString() {
//        return super.toString();
//    }
}

class PrimarySchoolStudent extends Student {
    private String parentName;

    public PrimarySchoolStudent(String name, int age, String parentName) {
        super(name, age);
        this.parentName = parentName;
    }

    @Override
    public String toString() {
        return parentName + "'s kid, " + super.toString();
    }
}