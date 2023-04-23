public class Main {

    public static void main(String[] args) {
        HourlyEmployee romulo = new HourlyEmployee(
                "Romulo",
                "1986-12-02",
                "2023-05-01",
                "2020-09-27",
                13.0
        );

        System.out.println(romulo.getDoublePay());
        System.out.println(romulo.collectPay());
        System.out.println(romulo.getAge());

    }

}
