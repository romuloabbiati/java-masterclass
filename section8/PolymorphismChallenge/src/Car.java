public class Car {

    private String description;

    public Car(String description) {
        this.description = description;
    }

    public void startEngine() {
        System.out.println("Car.startEngine() called: Switching on the engine");
        System.out.println("Class called = " + this.getClass().getSimpleName());
    }

    public void drive() {
        this.runEngine();
        System.out.println("Car.drive() called: driving the car");
    }

    protected void runEngine() {
        System.out.println("Car.runEngine() called: running the engine");
    }

    public String getDescription() {
        return description;
    }

    public static Car carFactory(String description) {
        return switch(description.toUpperCase().charAt(0)) {
            case 'G' -> new GasPoweredCar(description, 12.0, 5, 60);
            case 'E' -> new ElectricCar(description, 400.0, 100);
            case 'H' -> new HybridCar(description, 18.0, 60, 4);
            default -> new Car("Regular Car");
        };
    }

}


class GasPoweredCar extends Car {
    private double avgKmPerLitre;
    private int cylinders;
    private int tankCapacity;

    public GasPoweredCar(String description, double avgKmPerLitre, int cylinders, int tankCapacity) {
        super(description);
        this.avgKmPerLitre = avgKmPerLitre;
        this.cylinders = cylinders;
        this.tankCapacity = tankCapacity;
    }

    @Override
    public void startEngine() {
        super.startEngine();
        System.out.println("GasPoweredCar.startEngine() called: need to wait a minute to heat up the car");
    }

    @Override
    public void drive() {
        super.runEngine();
        System.out.println("GasPoweredCar.drive() called: now that the car is warmed up, you can drive");
    }

    public double getAvgKmPerLitre() {
        return avgKmPerLitre;
    }

    public int getCylinders() {
        return cylinders;
    }

    public int getTankCapacity() {
        return tankCapacity;
    }
}


class ElectricCar extends Car {

    private double avgKmPerCharge;
    private int batterySize;

    public ElectricCar(String description, double avgKmPerCharge, int batterySize) {
        super(description);
        this.avgKmPerCharge = avgKmPerCharge;
        this.batterySize = batterySize;
    }

    @Override
    public void startEngine() {
        super.startEngine();
        System.out.println("ElectricCar.startEngine() called: you don't need to wait to drive like gas powered car");
    }

    @Override
    public void drive() {
        super.runEngine();
        System.out.println("ElectricCar.drive() called: driving the electric car");
    }

    public double getAvgKmPerCharge() {
        return avgKmPerCharge;
    }

    public int getBatterySize() {
        return batterySize;
    }
}


class HybridCar extends Car {

    private double avgKmPerLitre;
    private int batterySize;
    private int cylinders;

    public HybridCar(String description, double avgKmPerLitre, int batterySize, int cylinders) {
        super(description);
        this.avgKmPerLitre = avgKmPerLitre;
        this.batterySize = batterySize;
        this.cylinders = cylinders;
    }

    @Override
    public void startEngine() {
        super.startEngine();
        System.out.println("HybridCar.startEngine() called: with a hybrid car you don't need to wait " +
                "to warm up the car, because the electric motor will run initially");
    }

    @Override
    public void drive() {
        super.runEngine();
        System.out.println("HybridCar.drive() called: driving the hybrid car");
    }

    public double getAvgKmPerLitre() {
        return avgKmPerLitre;
    }

    public int getBatterySize() {
        return batterySize;
    }

    public int getCylinders() {
        return cylinders;
    }
}
