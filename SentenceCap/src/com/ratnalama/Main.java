/**
 * Sentence Capitalization         -A program to capitalize the first letter of each work in the string then return the
 *                                  capitalized string.
 * @author                          Ratna Lama
 * @version                         1.0
 * @since                           07/25/2019
 *
 * @description:
 * The function should capitalize the first letter of each word in the string then return the capitalized string.
 * ----EXAMPLES-----
 * capitalize("a short sentence") --> A Short Sentence
 * capitalize("a lazy fox") --> A Lazy Fox
 *
 */
package com.ratnalama;

public class Main {

    public static void main(String[] args) {
        System.out.println("------------------------SENTENCE CAPITALIZATION------------------------------------------");
        String str1 = "hello there! How is your day?";
        String str2 = "  ola! how do you do? ";

        System.out.println(capitalize(str1));
        System.out.println(capitalize(str2));

        System.out.println("\n---------------------------------------------------------------------------------------");
    }

    public static String capitalize(String str) {
        String result = "";

        /**
         * Trim white space from the string then
         * use white space to split the sentence to individual words
         */
        String words[] = str.trim().split("\\s");

        for (String w: words) {
            /**
             * substring(int beginIndex, int endIndex)
             * Returns a new string that is a substring of this string.
             */
            String firstLetter = w.substring(0,1);

            /**
             * substring(int beginIndex)
             * Returns a new string that is a substring of this string.
             */
            String afterFirstLetter = w.substring(1);
            result += firstLetter.toUpperCase() + afterFirstLetter + " ";
        }
        // remove white spaces then return result
        return result;
    }
}
