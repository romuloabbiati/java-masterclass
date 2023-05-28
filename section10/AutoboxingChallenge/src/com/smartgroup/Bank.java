package com.smartgroup;

import java.util.ArrayList;

public class Bank {

    private String name;
    private ArrayList<Customer> customers;

    public Bank(String name) {
        this.name = name;
        customers = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Customer> getCustomers() {
        return customers;
    }

    public boolean addCustomer(Customer customer) {
        int customerIndex = findCustomer(customer.getName());
        if(customerIndex >= 0) {
            System.out.println(customer.getName() + " is already a customer.");
            return false;
        } else {
            customers.add(customer);
            return true;
        }
    }

    public boolean addTransaction(String customerName, Double amount) {
        int customerIndex = findCustomer(customerName);
        if(customerIndex >= 0) {
            customers.get(customerIndex).getTransations().add(amount);
            return true;
        }
        return false;
    }

    public void printStatement(String customerName) {
        int customerIndex = findCustomer(customerName);
        System.out.println(customers.get(customerIndex).getName() +
                " --> " + customers.get(customerIndex).getTransations());
    }

    private int findCustomer(String customerName) {
        for(int i = 0; i < customers.size(); i++) {
            if(customers.get(i).getName().equalsIgnoreCase(customerName)) {
                return i;
            }
        }
        return -1;
    }

}
