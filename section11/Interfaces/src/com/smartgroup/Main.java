package com.smartgroup;

public class Main {

    public static void main(String[] args) {

        Bird bird = new Bird();
        Animal animal = bird;
        FlightEnabled flier = bird;
        Trackable tracked = bird;

        animal.move();
//        flier.move();
//        tracked.move();

//        flier.takeOff();
//        flier.fly();
//        tracked.track();
//        flier.land();
        inFlight(flier);
        inFlight(new Jet());

        Truck truck = new Truck();
        truck.track();

        double kmsTravelled = 100.0;
        double milesTravelled = kmsTravelled * FlightEnabled.MILES_TO_KM;
        System.out.printf("The truck travelled  %.2f km or %.2f miles%n", kmsTravelled, milesTravelled);
    }

    private static void inFlight(FlightEnabled flier) {
        flier.takeOff();
        flier.fly();
        if(flier instanceof Trackable tracked) {
            tracked.track();
        }
        flier.land();
    }

}
