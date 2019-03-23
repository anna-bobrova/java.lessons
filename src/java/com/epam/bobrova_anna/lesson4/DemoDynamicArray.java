package com.epam.bobrova_anna.lesson4;

import java.util.Arrays;

public class DemoDynamicArray {

    public static void main(String[] args) {
        DynamicArray arr1 = new DynamicArray(10);
        DynamicArray arr2 = new DynamicArray();

        System.out.println("Size of arr1: " + arr1.size());
        System.out.println("Size of arr2: " + arr2.size());

        for (int i = 0; i < 18; i++) {
            arr1.add(i);
        }

        for (int i = 0; i < 10; i++) {
            arr2.add(i);
        }

        System.out.println("Size of arr1: " + arr1.size());
        System.out.println("Size of arr2: " + arr2.size());

        System.out.println(arr1.toString());
        System.out.println(arr1.toString());

        arr1.remove(5);
        System.out.println("Array after removing of element with index 5: " + arr1.toString());
        System.out.println("Size of arr1: " + arr1.size());

        arr1.remove(16);
        System.out.println("Array after removing of element with last index: " + arr1.toString());
        System.out.println("Size of arr1: " + arr1.size());

        arr1.remove(0);
        System.out.println("Array after removing of element with zero index: " + arr1.toString());
        System.out.println("Size of arr1: " + arr1.size());

        arr1.remove(20);
        System.out.println(arr1.toString());

        System.out.println("Element of array with index 3: " + arr1.get(3));
    }

}