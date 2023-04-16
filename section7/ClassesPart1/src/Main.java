public class Main {

    public static void main(String[] args) {
        Car car = new Car();
//        car.make = "Porsche";
//        car.model = "Carrera";
        System.out.println("Make = " + car.getMake());
        System.out.println("Model = " + car.getModel());
        car.describeCar();
    }

}
