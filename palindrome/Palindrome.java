/**
 * Palindrome.java      --A program to check if a string is a palindrome.
 * @author			      Ratna Lama
 * @version   		      1.0
 * @since     		      12/27/2018
 */

package com.ratnalama.palindrome;

import com.ratnalama.reverseString.ReverseString;

/**
 * Algorithm:
 * Given a string, return true if the string is a palindrome or false if it is not.
 * Palindrome are strings that form the same word if it is reversed. Include spaces
 * and punctuations in if the string is a palindrome.
 *
 * ---Example---
 * "Mam" --- IS a --- palindrome
 * "World!" ---- IS NOT a --- palindrome
 */

public class Palindrome {
    private ReverseString r;

    // Constructor
    public Palindrome() {
    }

    /**
     * isPalindrome method checks if a given string is a palindrome
     * This class makes use of ReverseString class
     * @param str   string to be checked if it is a palindrome
     * @return  true/false  returns true if the string is a palindrome, false otherwise
     */
    public boolean isPalindrome(String str) {
        boolean flag;
        r = new ReverseString();
        // reverseString give string and convert to string
        String reverse = r.reverseUsingStringBuilder(str).toLowerCase();
        //String reverseString = new StringBuffer(str).reverseString().toString().toLowerCase();
        // check if the given string and the reverseString are the same
        if (str.toLowerCase().equals(reverse)) {
            System.out.println(str + " IS A palindrome");
            flag = true;
        } else {
            System.out.println(str + " IS NOt A palindrome");
            flag = false;
        }
        return flag;

    } // end isPalindrome()

} // end Palindrome Class
