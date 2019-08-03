/**
 * Fibonacci        -A program to compute n-the fibonacci number.
 * @author           Ratna Lama
 * @version          1.0
 * @date             07/30/2019
 *
 * @description:
 * The Fibonacci numbers are the numbers in the following integer sequence:
 * 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, ……..
 * In mathematical terms, the sequence Fn of Fibonacci numbers is defined by the recurrence relation
 *
 *     F(n) = 0 or 1             if n < 2
 *     F(n) = F(n-1) + F(n-2)    if n > 2
 */
package com.ratnalama;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        System.out.println("\n-----------------------------FIB RECURSIVE---------------------------------------------");
        // recursive
        long preTime = System.currentTimeMillis();
        System.out.println("Value of 30-th fibonacci numbers " + fibRecursive(30));
        long postTime = System.currentTimeMillis();
        System.out.println("Time taken to compute in milliseconds: " + (postTime - preTime));

        System.out.println("\n-----------------------------FIB ITERATIVE---------------------------------------------");
        // iterative
        preTime = System.currentTimeMillis();
        System.out.println("Value of 30-th fibonacci numbers " + fibIterative(30));
        postTime = System.currentTimeMillis();
        System.out.println("Time taken to compute in milliseconds: " + (postTime - preTime));

        System.out.println("\n------------------------------FIB MEMOIZATION------------------------------------------");
        // fib memoization implementation
        preTime = System.currentTimeMillis();
        System.out.println("Value of 30-th fibonacci numbers " + memoizedFib(30));
        postTime = System.currentTimeMillis();
        System.out.println("Time taken to compute in milliseconds: " + (postTime - preTime));
    } // end main()

    // memoization
    public static long memoizedFib(long num) {
        long[] fibArray = new long[40];
        long fibValue = 0;

        // base case
        if (num < 2 ) return num;

        if (fibArray[(int)num] !=0) {
            return fibArray[(int)num];
        } else {
            fibValue = memoizedFib(num - 1) + memoizedFib(num - 2);
            fibArray[(int) num ] = fibValue;
            return fibValue;
        }
    } // end memoizeFib()

    /**
     * fibRecursive - computes the n-th Fibonacci number recursively
     * @param num   n-th Fibonacci number to be computed
     * @return num  n-th Fibonacci number to be returned
     * Time Complexity: O(2^n)  Exponential
     * Space Complexity: O(n) linear
     */
    public static int fibRecursive(int num) {
        if (num < 2) {
            return num;
        }
        return fibRecursive(num - 1) + fibRecursive(num - 2);
    } // end fibRecursive()

    /**
     * Time and Space Complexity Optimized compared to Recursive approach
     * fibIterative - computes the n-the Fibonacci number iteratively
     * @param num   n-th Fibonacci number to be computed
     * @return num  n-th Fibonacci number to be returned
     * Time Complexity: O(n) Linear
     * Space Complexity: O(1) Constant
     */
    public static int fibIterative(int num) {
       int a = 0;
       int b = 1;
       int c;
       if (num == 0) return a;
       for (int i = 2; i <= num; i++) {
           c = a + b;
           a = b;
           b = c;
       }
       return b;
    } // end fibIterative()
} // end Main Class
