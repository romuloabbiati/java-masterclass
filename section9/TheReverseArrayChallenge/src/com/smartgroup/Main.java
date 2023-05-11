package com.smartgroup;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int[] array = readIntegers();
        int[] reversedArray = reverseCopy(array);
        System.out.println(Arrays.toString(reversedArray));
    }

    private static int[] reverseCopy(int[] array) {
        int[] reversedArray = new int[array.length];
        int maxIndex = reversedArray.length - 1;

        for(int el : array) {
            reversedArray[maxIndex--] = el;
        }
        return reversedArray;
    }

    private static void reverse(int[] array) {
        int maxIndex = array.length - 1;
        int halfLength = array.length / 2;

        for(int i = 0; i < halfLength; i++) {
            int temp = array[i];
            array[i] = array[maxIndex - i];
            array[maxIndex - i] = temp;
            System.out.println("----> " + Arrays.toString(array));
        }
    }

    private static int[] readIntegers() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Type in a list of integers separated by commas: ");
        String userInput = scanner.nextLine();

        String[] valuesAsString = userInput.split(",");
        int[] values = new int[valuesAsString.length];

        for(int i = 0; i < values.length; i++) {
            values[i] = Integer.parseInt(valuesAsString[i].trim());
        }
        return values;
    }

}
