import java.time.LocalDate;
import java.time.Period;

public class HourlyEmployee extends Employee {

    private double hourlyPayRate;

    public HourlyEmployee() {}

    public HourlyEmployee(String name, String birthDate, String endDate,
                          String hireDate, double hourlyPayRate) {
        super(name, birthDate, endDate, hireDate);
        this.hourlyPayRate = hourlyPayRate;
    }

    public double getDoublePay() {
        return 2 * collectPay();
    }

    @Override
    public double collectPay() {
        LocalDate hireDate = LocalDate.parse(this.hireDate);
        LocalDate currentDate = LocalDate.now();
        int days = Period.between(hireDate, currentDate).getDays();
        double pay = 2 * (hourlyPayRate * (days * 8.0));
        return pay;
    }
}
