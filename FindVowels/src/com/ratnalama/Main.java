/**
 * FindVowels.java       -A program to find total number of vowels, consonants, digits and white spaces in a given
 *                        sentence.
 * @author               Ratna Lama
 * @version              1.0
 * @since                07/27/2019
 *  *
 * @param {*} str        string or sentence to parse to find the total number of vowels
 * @return               returns the number of vowels used in a string
 *
 * @description
 */
package com.ratnalama;

import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        System.out.println("\n---------------------------------------------------------------------------------------");
        findVowels("5567 Hello 1220 There? How ARE YOU Doing?");

        System.out.println("\n---------------------------------------------------------------------------------------");
    } // end main()

    public static void findVowels(String str) {
        int vCount = 0, cCount = 0, dCount = 0, sCount = 0;
        // trim punctuations and convert string to lowerCase
        str = str.trim().toLowerCase();
//        char[] c = {'a', 'e', 'i', 'o', 'u'};
        for (int i=0; i<str.length(); i++) {
            char ch = str.charAt(i);
            // check vowels
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch =='u') {
                vCount++;
            } else {
                // check digits
                if (ch >= '0' && ch <= '9') {
                    dCount++;
                    // check white spaces
                } else if (ch == ' ') {
                    sCount++;
                    // must be consonants
                } else {
                    cCount++;
                }
            }
        }
        System.out.println("String length: " + str.length());
        System.out.println("Number of Vowels: " + vCount);
        System.out.println("Number of Consonants: " + cCount);
        System.out.println("Number of Digits: " + dCount);
        System.out.println("Number of White Spaces: " + sCount);
    } // end findVowels
} // end Main Class
