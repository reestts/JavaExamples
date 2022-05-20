package com.reestts.math;

public class MatrixMultiply {

    public static void main(String[] args) {
        // 2*3
        int[][] firstMatrix = {
                new int[]{1, 5},
                new int[]{2, 3},
                new int[]{1, 7}
        };

        // 4*2
        int[][] secondMatrix = {
                new int[]{1, 2, 3, 7},
                new int[]{5, 2, 8, 1}
        };

        int[][] multiArray = multiplyMatrices(firstMatrix, secondMatrix);

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(multiArray[i][j] + " ");
            }
            System.out.println("");
        }
    }

    static int[][] multiplyMatrices(int[][] firstMatrix, int[][] secondMatrix) {
        int[][] result = new int[firstMatrix.length][secondMatrix[0].length];

        for (int row = 0; row < result.length; row++) {
            for (int col = 0; col < result[row].length; col++) {
                result[row][col] = multiplyMatricesCell(firstMatrix, secondMatrix, row, col);
            }
        }

        return result;
    }

    static int multiplyMatricesCell(int[][] firstMatrix, int[][] secondMatrix, int row, int col) {
        int cell = 0;
        for (int i = 0; i < secondMatrix.length; i++) {
            cell += firstMatrix[row][i] * secondMatrix[i][col];
        }
        return cell;
    }
}
