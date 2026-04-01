package com.cracking.coding.interviews.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeNumberSum {
    public static List<Integer[]> threeNumberSum(int[] array, int targetSum) {
        List<Integer[]> result = new ArrayList<>();


        if (array == null || array.length == 0) {
            return result;
        }

        Arrays.sort(array);

        // Write your code here.
        for (int i = 0; i < array.length; i++) {
            int left = i + 1;
            int right = array.length - 1;
            while (left < right) {
                int currentSum = array[i] + array[left] + array[right];

                if (currentSum < targetSum) {
                    left++;
                } else if (currentSum > targetSum) {
                    right--;
                } else {
                    Integer[] subset = new Integer[3];
                    subset[0] = array[i];
                    subset[1] = array[left];
                    subset[2] = array[right];

                    result.add(subset);

                    left++;
                    right--;
                }
            }
        }
        return result;
    }
}
