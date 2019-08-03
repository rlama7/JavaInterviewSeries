/**
 * ReverseString.java   --A program to reverseString a string.
 * @author			      Ratna Lama
 * @version   		      1.0
 * @since     		      12/26/2018
 */
package com.ratnalama.reverseString;

/**
 * Algorithm:
 * Given a string, return a new string with the reversed order of characters
 * ---Example---
 * "Hello" ---reversed to --- "olleH"
 * "World!" ----reversed to --- "!dlroW"
 *
 */
public class ReverseString {
    private String str;

    // Constructor
    public ReverseString() {
    }

    /**
     * #1
     * reverses string using toCharArray()
     * toCharArray() converts string to character Array
     * @param str   string to be reversed
     */
    public void reverseUsingtoCharArray(String str) {
        char[] inputStr = str.toCharArray();
        System.out.print(str + " --- {reversed to} ---> " + " ");
        for (int i = inputStr.length -1; i >= 0; i--) {
            System.out.print(inputStr[i]);
        }
        System.out.println();
    }

    /**
     * #2
     * reverses string by making using of reverseString() in Java's StringBuilder Class
     * @param str   string to be reversed
     */
    public String reverseUsingStringBuilder(String str) {
        StringBuilder inputStr = new StringBuilder();

        // Append the specified string to this character sequence
        inputStr.append(str);

        // Causes this character sequence to be replaced by the reverse string of the sequence
        inputStr = inputStr.reverse();

        // display
//
//        System.out.println(inputStr);
        return inputStr.toString();
    }

    /**
     * reverses string recursively
     * @param str   string to be reversed
     */
    public void reverseRecursively(String str) {
        if (str == null || str.length() <= 1) {
            System.out.println(str);

        } else {
            System.out.print(str.charAt(str.length() - 1));
            reverseRecursively(str.substring(0, str.length() - 1));
        }
    }




    /*-------------------BEGIN Getters and Setters------------------------------------------------*/
    public String getStr() {
        return str;
    }

    public void setStr(String str) {
        this.str = str;
    }

} // end reverseString Class
