package com.cracking.coding.interviews.arrays;

import java.util.Arrays;

public class SmallestDifference {

    public static int[] smallestDifference(int[] arrayOne, int[] arrayTwo) {
        int[] result = new int[2];

        Arrays.sort(arrayOne);
        Arrays.sort(arrayTwo);

        int arrayOnePointer = 0;
        int arrayTwoPointer = 0;

        int smallestDifference = Integer.MAX_VALUE;

        while (arrayOnePointer < arrayOne.length && arrayTwoPointer < arrayTwo.length) {
            int newSmallestDifference = Math.abs(arrayOne[arrayOnePointer] - arrayTwo[arrayTwoPointer]);

            if (newSmallestDifference < smallestDifference) {
                smallestDifference = newSmallestDifference;
                result[0] = arrayOne[arrayOnePointer];
                result[1] = arrayTwo[arrayTwoPointer];
            }

            if (arrayOne[arrayOnePointer] < arrayTwo[arrayTwoPointer]) {
                arrayOnePointer++;
            } else {
                arrayTwoPointer++;
            }
        }

        return result;
    }

}
