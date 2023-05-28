package com.smartgroup;

public class Main {

    public static void main(String[] args) {

        Customer romulo = new Customer("Romulo", 0.0);
        romulo.getTransations().add(2000.0);
        romulo.getTransations().add(-200.0);
        romulo.getTransations().add(500.0);

        Customer isabela = new Customer("Isabela", 0.0);
        isabela.getTransations().add(2300.0);
        isabela.getTransations().add(-300.0);
        isabela.getTransations().add(700.0);

        Bank bank = new Bank("Lloyds");
        bank.addCustomer(romulo);
        bank.addCustomer(isabela);

        bank.addTransaction(romulo.getName(), 180.0);
        bank.printStatement(romulo.getName());

    }

}
