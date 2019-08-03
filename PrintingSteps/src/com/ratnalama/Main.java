/**
 * Printing Steps       -A program to console log a step shape with N levels using
 *                      the # character. Make sure the step has spaces ont he right hand side!
 * @author              Ratna Lama
 * @version             1.0
 * @since               07/26/2019
 *
 * @description:
 *
 * -------------EXAMPLE------------------
 * steps(2)
 *  '# '
 *  '##'
 *
 * setps(3)
 * '#  '
 * '## '
 * '###'
 */

package com.ratnalama;

public class Main {

    public static void main(String[] args) {
        System.out.println("\n--------------------------ITERATIVE SOLUTION-------------------------------------------");
        step(4);
        System.out.println("\n--------------------------RECURSIVE SOLUTION-------------------------------------------");
        recursiveStep(4, 0, "");
    } // end main()

    // iterative solution
    public static void step(int num) {
        String str = " ";
        if (num <= 0) {
            System.out.println("Sorry the number must be greater or equal to 1");
        } else {
            for (int row=0; row<num; row++) {
                for (int col=0; col<num; col++) {
                    if (col < row) {
                        str += "#";
                    } else {
                        str += " ";
                    }
                }
                System.out.println("\'" + str + "\'");
            }
        }
    } // end step() - iterative solution

    // recursive solution
    public static void recursiveStep(int num, int row, String stair) {
        row = 0;
        stair = "";
        // Base Case
        if (num == row) {
            return;
        }
        // Recursive case
        if (num == stair.length()) {
            System.out.println(stair);
            recursiveStep(num-1, row+1, stair);
        }

        if (stair.length() <= row) {
            stair += "#";
        } else {
            stair += " ";
        }
        recursiveStep(num-1, row, stair);

    } // end recursiveStep()

} // end Main Class
