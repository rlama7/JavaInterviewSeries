/**
 * FizzBuzz.java      --A program to display numbers from 1 to n. Displays "fizz" when the
 *                      number is a multiple of three. Displays "buzz" when the number is
 *                      a multiple of five. Displays "fizzbuzz" when the number is multiple of
 *                      both three and five.
 * @author			    Ratna Lama
 * @version   		    1.0
 * @since     		    12/29/2018
 *
 * @description         ---Example---
 * fizzBuzz(5)
 * Displays:
 * 1
 * 2
 * fizz
 * 4
 * buzz
 */
package com.ratnalama.fizzbuzz;

public class FizzBuzz {

    // Constructor
    public FizzBuzz() {
    }

    /**
     * fizzBuzz displays number from 1 to n-numbers.
     * If the number is a multiple of both 3 and 5 displays "fizzbuzz"
     * If the number is a multiple of 3 then displays "fizz"
     * If the number is a multiple of 5 then dispalys "buzz"
     * Otherwise display the number as it is.
     * @param num number to be displayed as fizzbuzz
     */
    public void fizzBuzz(int num) {
        System.out.print("[");
        for (int i = 1; i <= num; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.print(" fizzbuzz ");
            } else if (i % 3== 0) {
                System.out.print(" fizz ");
            } else if(i % 5 == 0) {
                System.out.print(" buzz ");
            } else {
                System.out.print(i + " ");
            }
        }
        System.out.print("]");
    } // end fizzBuzz()

    public void recursiveFizzBuzz(int num) {
        if (num != 1) {
            if ((num % 3 == 0) && (num % 5 == 0)) {
                System.out.print("fizzbuzz ");
            } else if(num % 3 == 0) {
                System.out.print(" fizz ");
            } else if (num % 5 == 0) {
                System.out.print(" buzz ");
            } else {
                System.out.print(num + " ");
            }
            recursiveFizzBuzz(num-1);
        } else {
            System.out.print(num + " ");
            System.exit(0);
        }
    } // end recursiveFizzBuzz()
} // end FizzBuzz Class
