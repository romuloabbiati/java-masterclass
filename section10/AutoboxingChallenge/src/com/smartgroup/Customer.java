package com.smartgroup;

import java.util.ArrayList;

public class Customer {

    private String name;

    private ArrayList<Double> transations;

    public Customer(String name, double initialDeposit) {
        this.name = name;
        transations = new ArrayList<>(500);
        transations.add(initialDeposit);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Double> getTransations() {
        return transations;
    }
}
