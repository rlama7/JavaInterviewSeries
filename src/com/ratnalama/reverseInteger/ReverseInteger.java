/**
 * ReverseInteger.java      --A program to reverse an integer number.
 * @author			          Ratna Lama
 * @version   		          1.0
 * @since     		          12/27/2018
 */
package com.ratnalama.reverseInteger;

import com.ratnalama.reverseString.ReverseString;

/**
 * Algorithm:
 * Given an integer, return an integer that is the reverse ordering of number
 *
 * ---Example---
 * 123 --- reversed to ---> 321
 * 700 --- reversed to ---> 7
 * -51 --- reversed to ---> -15
 * -100 --- reversed to ---> -1
 */

public class ReverseInteger {
    private ReverseString rs;

    // Constructor
    public ReverseInteger() {
    }

    /**
     * reverseInt reverse the integer that is the reverse ordering of number
     * @param num   integer to be reversed
     * @return  reversedNum reverse ordering of number to return
     */
    public int reverseInt(int num) {
        rs = new ReverseString();
        String str, reverseStr;
        int reversedNum, positiveNum;
        if (Math.signum(num) >= 0) {
            str = Integer.toString(num);
            reverseStr = rs.reverseUsingStringBuilder(str);
            reversedNum = Integer.parseInt(reverseStr);
        } else {
            positiveNum = num*(-1);
            str = Integer.toString(positiveNum);
            reverseStr = rs.reverseUsingStringBuilder(str);
            reversedNum = Integer.parseInt(reverseStr)*(-1);
        }
        return reversedNum;
    }

} // end ReverseInteger Class
