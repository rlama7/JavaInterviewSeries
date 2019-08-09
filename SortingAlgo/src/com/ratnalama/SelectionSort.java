/**
 * SelectionSort.java        -A program to implement sorting algorithm such as Selection Sort
 * @author                    Ratna Lama
 * @version                   1.0
 * @since                     08/08/2019
 *
 * @description:
 * Implementation of Sorting Algorithm:
 * INPUTS:
 *          Array --> an array to be sorted
 * OUTPUTS:
 *         Array --> a sorted array in an ascending order (increasing order, e.g.: 1,2,3,4,5,6,7.....)
 *
 * STEPS:
 *        1) for i = 0 to array.length -1
 *              a) set minimum to i
 *              b) for j = i + 1 to array.length:
 *                      i) if array[j] < array[minimum]
 *                          then set minimum to j
 *              c) Swap array[i] with array[minimum]
 *
 * Time Complexity: O(n^2) --> Quadratic
 */
package com.ratnalama;

public class SelectionSort {

    public int[] selectionSort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int min = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[min]) {
                    min = j;
                }
            }
            int temp = array[i];
            array[i] = array[min];
            array[min] = temp;
        }
        return array;
    } // end selectionSort()
} // end SelectionSort Class
