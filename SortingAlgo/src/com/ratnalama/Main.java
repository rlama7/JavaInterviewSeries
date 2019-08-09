/**
 * Main.java                 -A driver program to implement sorting algorithm such as Selection Sort,
 *                            Insertion Sort, Merge Sort, Quick Sort
 * @author                    Ratna Lama
 * @version                   1.0
 * @since                     08/08/2019
 *
 * @description:
 * Implementation of Sorting Algorithm:
 */
package com.ratnalama;

public class Main {

    public static void main(String[] args) {
        System.out.println("\n------------------SELECTION SORT-------------------------------------------------------");
        SelectionSort ss = new SelectionSort();
        int [] array = {34, 2, 12, 7, 3, 9, 1, 55, 0, 3, 15};
        ss.selectionSort(array);
        display(array);

        System.out.println("\n\n-------------------INSERTION SORT----------------------------------------------------");
        InsertionSort ins = new InsertionSort();
        ins.insertionSort(array);
        display(array);

        System.out.println("\n---------------------------------------------------------------------------------------");
        System.out.println("\n---------------------------------------------------------------------------------------");
    } // end main()

    // display
    public static void display(int[] array) {
        System.out.print("[ ");
        for (int i=0; i<array.length; i++) {

            if (i == array.length -1) {
                System.out.print(array[i]);
                break;
            }
            System.out.print(array[i] + ", ");
        }
        System.out.print(" ]");
    } // end display()
} // end Main Class
