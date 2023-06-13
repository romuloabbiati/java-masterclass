package com.smartgroup;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

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

//        ArrayList<FlightEnabled> fliers = new ArrayList<>();
//        fliers.add(bird);
        LinkedList<FlightEnabled> fliers = new LinkedList<>();
        fliers.add(bird);

        List<FlightEnabled> betterFliers = new ArrayList<>();
        betterFliers.add(bird);

        triggerFliers(fliers);
        flyFliers(fliers);
        landFliers(fliers);

        triggerFliers(betterFliers);
        flyFliers(betterFliers);
        landFliers(betterFliers);
    }

    private static void inFlight(FlightEnabled flier) {
        flier.takeOff();
        flier.fly();
        if(flier instanceof Trackable tracked) {
            tracked.track();
        }
        flier.land();
    }

    private static void triggerFliers(ArrayList<FlightEnabled> fliers) {
        for(var flier : fliers) {
            flier.takeOff();
        }
    }

    private static void flyFliers(ArrayList<FlightEnabled> fliers) {
        for(var flier : fliers) {
            flier.fly();
        }
    }

    private static void landFliers(ArrayList<FlightEnabled> fliers) {
        for(var flier : fliers) {
            flier.land();
        }
    }

}
