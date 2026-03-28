package com.cracking.coding.interviews.arrays;

public class TransposeMatrix {

    public int[][] transposeMatrix(int[][] matrix) {
        // Write your code here.
        int[][] transposeMtrx = new int[matrix[0].length][matrix.length];
        for (int i = 0; i < matrix.length; i++) {
            int[] array = matrix[i];
            for (int j = 0; j < array.length; j++) {
                transposeMtrx[j][i] = array[j];
            }
        }

        return transposeMtrx;
    }

}
