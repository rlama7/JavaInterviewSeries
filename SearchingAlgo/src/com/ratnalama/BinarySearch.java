/**
 * BinarySearch.java         -A program to implement a Binary Search
 * @author                    Ratna Lama
 * @version                   1.0
 * @since                     08/08/2019
 *
 * @description:
 * Implementation of Binary Search - Divide and Conquer Paradigm
 * The item to be search MUST be SORTED TO apply Binary Search
 *
 * BINARY-SEARCH(array, x)
 *  * Inputs:
 *  *      array --> the SORTED array to search in
 *  *      x     --> the value to search for in the array
 *  *
 *  * Outputs:
 *  *      The index position where array[i] == x or -1 if not found
 *  *
 *  * Steps:
 *  * 1) first = 0; last = array.length -1, mid         // first --> beginning of the array
 *                                                      // mid --> mid of the array
 *                                                      // last --> end of the array
 *  * 2) while (first <= last) do
 *          a) set mid <-- [ (first + last) / 2]   // take the floor value
 *          b) if array[mid] == x, return mid      // we've found the item and it's index location
 *          c) if array[mid] > x, set last <-- (mid -1)  // the item we're looking is to the left of the mid-value.
 *          d) else set first <-- (mid + 1)             // the item we're looking is to the right of the mid-value
 *          e) return -1        // we couldn't find the item
 *
 *          Thus, in each recursive call, the number of searches to be made is halved making it the most
 *          efficient searching algorithm.
 *
 *
 * Time Complexity for Search and Access:
 */
package com.ratnalama;

public class BinarySearch {
    // iterative version
    public int binarySearchIterative(int[] array, int x) {
        int first = 0; // beginning of the array
        int last = array.length - 1;    // end of the array
        int mid;        // middle point of the array

        while (first <= last) {
            mid = (first + last) / 2;
            if (array[mid] == x) {
                return mid;
            }
            if (array[mid] > x) { // the data must be to the left of the mid-value
                last = mid - 1;
            } else {
                first = mid + 1; // the data must be to the right of the mid-value
            }
        }
        return -1;
    } // end binarySearchIterative()

    // recursive version
    public int binarySearchRecursive(int[] array, int target, int first, int last) {
        if (first > last) {
            return -1;  // we've crossed the array boundary and couldn't locate the target
        } else {
            int mid = (first + last) / 2;
            if (array[mid] == target) {
                return mid; // found target at the index position
            } else if (array[mid] > target) {
                // the target item must be to the left of mid value
                return binarySearchRecursive(array, target, first, mid -1);
            } else {
                // the target item must be to the right of mid value
                return binarySearchRecursive(array, target, mid + 1, last);
            }
        }
    } // end binarySearchRecursive()

} // end BinarySearch()
