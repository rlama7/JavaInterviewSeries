package com.ratnalama;

public class Main {

    public static void main(String[] args) {
        System.out.println("\n---------------------------------------------------------------------------------------");
        matrixSpiral(3);

        System.out.println("\n---------------------------------------------------------------------------------------");
    } // end main()

    public static void matrixSpiral(int num) {
        int[][] matrix = new int[num][num]; // declare NxN matrix
        int beginRow = 0, endRow = num -1, beginCol = 0, endCol = num - 1, counter = 1;
        while (beginCol <= endCol && beginRow <= endRow) {
            // top row
            for (int i = beginCol; i<= endCol; i++) {
                matrix[beginRow][i] = counter;
                counter++;
            }
            beginRow++;
            // right col
            for (int i= beginRow; i<= endRow; i ++) {
                matrix[i][endCol] = counter;
                counter++;
            }
            endCol--;
            // bottom row
            for (int i= endCol; i>=beginCol; i--) {
                matrix[endRow][i] = counter;
                counter++;
            }
            endRow--;
            // start col
            for (int i=endRow; i>=beginRow; i--) {
                matrix[i][beginCol] = counter;
                counter++;
            }
            beginCol++;
        }
        for (int row = 0; row<matrix.length-1; row++) {
            for(int col= row; col<matrix.length-1; col++) {
                System.out.println(matrix[row][col]);
            }
        }
    } // end matrixSprial()
} // end Main Class
