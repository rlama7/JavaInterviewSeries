/**
 * InsertionSort.java        -A program to implement Insertion Sort
 * @author                    Ratna Lama
 * @version                   1.0
 * @since                     08/08/2019
 *
 * @description:
 * Implementation of Insertion Sort Algorithm:
 * INPUTS:
 *          Array --> an array to be sorted
 * OUTPUTS:
 *         Array --> a sorted array in an ascending order (increasing order, e.g.: 1,2,3,4,5,6,7.....)
 *
 * STEPS:
 *         Array
 *         ---------------------------------------------------------------------------
 *         |  sorted section         j | i        unsorted section                   |
 *         ----------------------------------------------------------------------------
 *
 *        // Consider array element at 0th index to be sorted so start from position 1
 *        // i --> index position of the beginning of the unsorted array part
 *        // j --> index position of the last of the sorted array part
 *
 *        1) for i = 1 to array.length
 *              a) set element to array[i], and set j to i-1
 *              b) while j >= 0 and array[j] > element:
 *                      i) set array[j+1] to array[j]
 *                      ii) decrement j by 1
 *              c) Set array[j+1] to element
 *
 * Time Complexity: O(n^2) --> Quadratic --> Worst Case
 *                  O(n) --> Linear --> Best Case
 */

package com.ratnalama;

public class InsertionSort {
    public int[] insertionSort(int[] array) {
        // i points to the unsorted array elements
        // j points to the sorted array elements
        for (int i = 1; i < array.length; i++) {
            // element contains data we intend to bring over to the sorted area from the unsorted area
            int element = array[i];
            int j = i -1;           // j points to the index position of the last value in the sorted area.
            while (j >= 0 && array[j] > element) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = element;
        }
        return array;
    } // end insertionSort()
} // end InsertionSort Class
