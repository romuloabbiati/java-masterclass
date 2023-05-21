package com.smartgroup;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        ItemsList list = new ItemsList();

        int option = 0;
        String userInput = "";

        do {
            printOptions();

            option = scanner.nextInt();

            switch(option) {
                case 0 -> option = 0;
                case 1 -> {
                    System.out.print("Type in the item you want to add: ");
                    userInput = scanner.next();
                    list.addItems(userInput);
                }
                case 2 -> {
                    System.out.print("Type in the item you want to remove: ");
                    userInput = scanner.next();
                    list.removeItems(userInput);
                }
            }

        } while (option != 0);

        System.out.println(list.getItems());

        scanner.close();

    }

    public static void printOptions() {
        System.out.println("Available actions: \n" +
                "0 - to shutdown\n" +
                "1 - to add items(s) to list (comma delimited list) \n" +
                "2 - to remove any items (comma delimited list) \n" +
                "Enter a number for which action you want to do: ");
    }

}
