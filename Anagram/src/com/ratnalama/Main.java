/**
 * Anagram          -A program to check if two strings are anagram of each other
 * @author           Ratna Lama
 * @version          1.0
 * @since            07/25/2019
 *
 * @description:
 * check to see if string 1 and string 2 are anagrams of each other.
 * One string is an anagram of another if it uses the same characters in the same quantity.
 * Only consider characters, not spaces or punctuation.
 * Consider capital letters to be the same as the lower case
 * -------------EXAMPLE------------------
 * anagram("rail safety", "fairy tales") --> TRUE
 * anagram("RaiL SAFety!", "Fairy TALEs") --> TRUE
 * anagram("Hello There", "Bye there") --> FALSE
 */
package com.ratnalama;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        System.out.println("\n---------------------------ANAGRAM-----------------------------------------------------");
        String str1 = "rail? safety";
        String str2 = "Fairy TALEs!";
        String str3 = "Bye there!";

        System.out.println(cleanStr(str1));

        System.out.println(sortCleanedStr(str1));

        System.out.println(anagram(str1, str2));

        System.out.println(anagram(str1, str3));

        System.out.println("\n---------------------------------------------------------------------------------------");
    } // end main()

    // check if two strings are anagram
    public static boolean anagram(String str1, String str2) {
        boolean flag = false;

        if (sortCleanedStr(str1).equals(sortCleanedStr(str2))) {
            flag = true;
        }
        return flag;
    } // end anagram()

    // clean string
    public static String cleanStr(String str) {
        return str.replaceAll("[^A-Za-z]+", "").toLowerCase();
    } // end cleanStr()

    // sort cleaned string
    public static String sortCleanedStr(String str) {
        // clean string of space and punctuation
        String cleanedStr = cleanStr(str);
        // convert string to char array
        char[] c = cleanedStr.toCharArray();
        // sort char array
        Arrays.sort(c);
        String sortedStr = new String(c);
        return sortedStr;
    } // end sortCleanedStr()
} // end Main Class
