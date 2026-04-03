package com.cracking.coding.interviews.arrays;

import java.util.ArrayList;
import java.util.List;

public class MoveElementToEnd {

    public static List<Integer> moveElementToEnd(List<Integer> array, int toMove) {
        // Write your code here.
        for (int i = 0; i < array.size(); i++) {

            if (array.get(i) == toMove) {
                int rightPointer = i + 1;

                while (rightPointer < array.size()) {
                    if (array.get(rightPointer) != toMove) {
                        array.set(i, array.get(rightPointer));
                        array.set(rightPointer, toMove);
                        break;
                    }
                    rightPointer++;
                }
            }
        }

        return array;
    }

}
