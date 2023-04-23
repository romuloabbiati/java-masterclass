import java.time.LocalDate;
import java.time.Period;

public class Worker {

    private String name;
    private String birthDate;
    private String endDate;

    public Worker() {}

    public Worker(String name, String birthDate, String endDate) {
        this.name = name;
        this.birthDate = birthDate;
        this.endDate = endDate;
    }

    public int getAge() {
        LocalDate currentDate = LocalDate.now();
        LocalDate dob = LocalDate.parse(birthDate);
        int age = Period.between(dob, currentDate).getYears();
        return age;
    }

    public double collectPay() {
        return 0.0;
    }

    public void terminate(String endDate) {
        this.endDate = endDate;
    }

    @Override
    public String toString() {
        return "Worker{" +
                "name='" + name + '\'' +
                ", birthDate='" + birthDate + '\'' +
                ", endDate='" + endDate + '\'' +
                '}';
    }
}
