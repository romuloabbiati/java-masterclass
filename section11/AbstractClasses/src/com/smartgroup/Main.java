package com.smartgroup;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        Dog dog = new Dog("Wolf", "big", 100.00);
        dog.makeNoise();
        doAnimalStuff(dog);

        ArrayList<Animal> animals = new ArrayList<>();
        animals.add(dog);
        animals.add(new Dog("German Shephard", "big", 150.00));
        animals.add(new Fish("Goldfish", "small", 1.00));
        animals.add(new Fish("Barracuda", "big", 75.00));
        animals.add(new Fish("Pug", "small", 20.00));

        for(Animal animal : animals) {
            doAnimalStuff(animal);
        }

    }

    public static void doAnimalStuff(Animal animal) {
        animal.makeNoise();
        animal.move("slow");
    }

}
