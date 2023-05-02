public class Main {

    public static void main(String[] args) {

        Car gasPoweredCar = Car.carFactory("Gas");
        gasPoweredCar.startEngine();
        gasPoweredCar.drive();

        System.out.println();

        Car electricCar = Car.carFactory("Electric");
        electricCar.startEngine();
        electricCar.drive();

        System.out.println();

        Car hybridCar = Car.carFactory("Hybrid");
        hybridCar.startEngine();
        hybridCar.drive();

    }

}
