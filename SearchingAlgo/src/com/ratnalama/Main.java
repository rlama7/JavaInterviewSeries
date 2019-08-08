/**
 * Main.java                 -A driver program to implement searching algorithm such as Linear Search,
 *                            Binary Search...
 * @author                    Ratna Lama
 * @version                   1.0
 * @since                     08/08/2019
 *
 * @description:
 * Implementation of Search Algorithm:
 */
package com.ratnalama;

public class Main {

    public static void main(String[] args) {
        System.out.println("\n---------------------LINEAR SEARCH ITERATIVE-------------------------------------------");
        int[] arr = {1,2,3,4,5,6,7, 8, 10, 20, 30, 40, 50, 60, 70, 90, 100};
        LinearSearch ls = new LinearSearch();
        int index = ls.linearSearchIterative(arr, 5);
        System.out.println("index position of 5: " + index);
        index = ls.linearSearchIterative(arr, 0);
        System.out.println("index position of 0: " + index);

        System.out.println("\n---------------------RECURSIVE LINEAR SEARCH-------------------------------------------");
        index = ls.linearSearchRecursive(arr, 0, 40);
        System.out.println("index of 40: " + index);
        index = ls.linearSearchRecursive(arr, 0, 101);
        System.out.println("index of 101: " + index);

        System.out.println("\n---------------------BINARY SEARCH ITERATIVE-------------------------------------------");
        BinarySearch bs = new BinarySearch();
        index = bs.binarySearchIterative(arr, 7);
        System.out.println("index of 7: " + index);
        index = bs.binarySearchIterative(arr, 9);
        System.out.println("index of 9: " + index);

        System.out.println("\n--------------------BINARY SEARCH RECURSIVE--------------------------------------------");
        index = bs.binarySearchRecursive(arr, 9, 0, arr.length - 1);
        System.out.println("index of 9: " + index);
        index = bs.binarySearchRecursive(arr, 90, 0, arr.length -1);
        System.out.println("index of 90: " + index);

        System.out.println("\n---------------------------------------------------------------------------------------");
    } // end main()
} // end Main Class
