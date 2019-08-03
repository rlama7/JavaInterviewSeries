/**
 * ArrayChunk.java      --A program to divide given array into sub-arrays where
 *                        each sub-array is of length size.
 * @author			      Ratna Lama
 * @version   		      1.0
 * @since     		      01/09/2019
 *
 * @description         ---Example---
 * chunk(array, size)
 * chunk([1,2,3,4], 2) --> [ [1,2], [3,4] ]
 * chunk([1,2,3,4,5], 2) --> [ [1,2], [3,4], [5] ]
 * chunk([1,2,3,4,5], 4) --> [ [1,2,3,4],[5] ]
 * chunk([1,2,3,4,5], 7) --> [ [1,2,3,4,5] ]
 *
 */
package com.ratnalama.arrayChunk;

import java.util.Arrays;

public class ArrayChunk {
    private int[] subArray;
    private int size;

    // Constructors
    public ArrayChunk() {
        subArray = new int[size];
    }

    public void chunk(int[] array, int chunkSize) {
        // check if the size is 0 or less
        if (chunkSize <= 0) {
            System.out.println("The array must have a size greater or equal to 1.");
        } else if (chunkSize >= array.length) {
            System.out.println(Arrays.toString(array));
        }

        int splitSize = array.length % chunkSize;



        while (splitSize > 0) {
            for (int i = 0; i < array.length; i++) {
                while (subArray.length != chunkSize  || subArray[subArray.length -1] != array[array.length - 1]) {
                    subArray[i] = array[i];
                }
                System.out.println(Arrays.toString(subArray));
            }
            splitSize--;

        }

    }


} // end ArrayChunk Class
