/**
 * LinearSearch.java         -A program to implement linear Search algorithm
 * @author                    Ratna Lama
 * @version                   1.0
 * @since                     08/08/2019
 *
 * @description:
 * Implementation of Search Algorithm: Algorithm:
 *
 * LINEAR-SEARCH(array, target)
 * Inputs:
 *      array  --> the array to search in
 *      target --> the value to search for in the array
 *
 * Outputs:
 *      The index position where array[i] == target or -1 if not found
 *
 * Steps:
 * 1) set answer to -1
 * 2) For each index i going from 1 to n, in order,
 *      if array[i] == target, then set answer to the value of i
 * 3) Return the value of answer as the output *
 *
 * Time Complexity: O(n) --> Worst Case
 */
package com.ratnalama;

public class LinearSearch {
    // Iterative version
    public int linearSearchIterative(int[] array, int target) {

        for (int i = 0; i < array.length; i++) {
            if (array[i] == target) {
                return i; // as soon as we find the item, exit the loop
            }
        }
        return -1;  // if we couldn't find the item, then by default return -1
    } // end linearSearchIterative()

    // Recursive Version
    public int linearSearchRecursive(int[] array, int index, int target) {
         if (index > array.length -1) { // if evaluates to true, target was not found
             return -1;
         } else if (array[index] == target) {
             return index;
         } else {
             return linearSearchRecursive(array, index + 1, target);
         }
    } // end linearSearchRecursive()

} // end LinearSearch Class
