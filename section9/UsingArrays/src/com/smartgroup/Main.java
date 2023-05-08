package com.smartgroup;

import java.util.Arrays;
import java.util.Random;

public class Main {

    public static void main(String[] args) {

        int[] firstArray = getRandomArray(10);
        System.out.println(Arrays.toString(firstArray));
        Arrays.sort(firstArray);
        System.out.println(Arrays.toString(firstArray));

        int[] secondArray = new int[10];
        System.out.println(Arrays.toString(secondArray));
        Arrays.fill(secondArray, 5);
        System.out.println(Arrays.toString(secondArray));

        int[] thirdArray = getRandomArray(10);
        System.out.println(Arrays.toString(thirdArray));

        int[] fourthArray = Arrays.copyOf(thirdArray, thirdArray.length);
        System.out.println(Arrays.toString(fourthArray));

        Arrays.sort(fourthArray);
        System.out.println(Arrays.toString(thirdArray));
        System.out.println(Arrays.toString(fourthArray));

        int[] smallerArray = Arrays.copyOf(thirdArray, 5);
        System.out.println(Arrays.toString(smallerArray));

        int[] largerArray = Arrays.copyOf(thirdArray, 15);
        System.out.println(Arrays.toString(largerArray));

        // to use the Arrays.binarySearch() method, the array must be sorted.
        // to arguments are passed, the array (or sorted array) and the element you are looking for
        String[] sArray = {"Able", "Jane", "Mark", "Ralph", "David"};
        Arrays.sort(sArray);
        System.out.println(Arrays.toString(sArray));
        if(Arrays.binarySearch(sArray, "Mark") >= 0) {
            System.out.println("Found Mark in the list");
        }

        // the Arrays.equals(array1, array2) compares 2 arrays, if they are equal it will return true
        // otherwise it will return false. To be equal, the elements must have the same type, same order and
        // same number of elements
        int[] s1 = {1, 2, 3, 4, 5};
        int[] s2 = {1, 2, 3, 4 ,5, 0};
        if(Arrays.equals(s1, s2)) {
            System.out.println("Arrays are equal");
        } else {
            System.out.println("Arrays are not equal");
        }

    }

    public static int[] getRandomArray(int len) {
        Random random = new Random();
        int[] newInt = new int[len];
        for(int i = 0; i < newInt.length; i++) {
            newInt[i] = random.nextInt(100);
        }
        return newInt;
    }

}
