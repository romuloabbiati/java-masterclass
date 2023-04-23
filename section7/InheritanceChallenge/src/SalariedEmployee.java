public class SalariedEmployee extends Employee {

    private double annualSalary;
    private boolean isRetired;

    public SalariedEmployee() {}

    public SalariedEmployee(String name, String birthDate, String endDate,
                            String hireDate, double annualSalary, boolean isRetired) {
        super(name, birthDate, endDate, hireDate);
        this.annualSalary = annualSalary;
        this.isRetired = isRetired;
    }

    @Override
    public double collectPay() {
        double payslip = annualSalary / 26;
        double adjustedPay = (isRetired) ? 0.9 * payslip : payslip;
        return (int) adjustedPay;
    }

    public void retire() {
        terminate("12/12/2025");
        isRetired = true;
    }
}
