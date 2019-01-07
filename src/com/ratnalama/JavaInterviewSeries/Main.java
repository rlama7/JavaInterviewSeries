/**
 * Main.java            --A driver program to Java interview series.
 * @author			      Ratna Lama
 * @version   		      1.0
 * @since     		      12/26/2018
 */
package com.ratnalama.JavaInterviewSeries;

import com.ratnalama.fizzbuzz.FizzBuzz;
import com.ratnalama.maxChars.MaxChars;
import com.ratnalama.palindrome.Palindrome;
import com.ratnalama.reverseInteger.ReverseInteger;
import com.ratnalama.reverseString.ReverseString;

public class Main {

    public static void main(String[] args) {
        ReverseString rs = new ReverseString();
        Palindrome p = new Palindrome();
        ReverseInteger ri = new ReverseInteger();
        MaxChars mxc = new MaxChars();
        FizzBuzz fzbz = new FizzBuzz();
        System.out.println("---------------------------------------------------------------");

        // String Reversal
        System.out.println("---String Reversal---");
        System.out.println("#1 String Reversal using toCharArray()");
        rs.reverseUsingtoCharArray("Hello");
        System.out.println("#2 String Reversal using StringBuilder Class");
        String r = rs.reverseUsingStringBuilder("Apple");
        System.out.println("Apple --- {reversed to} ---> " + r);
        System.out.println("#3 String Reversal using Recursive Call");
        System.out.print("Happy" + " --- {reversed to} ---> " + " ");
        rs.reverseRecursively("Happy");
        System.out.println("-----------------------------------------------------------\n");

        // Palindrome
        System.out.println("---Palindrome---");
        p.isPalindrome("Mam");
        p.isPalindrome("World!");
        System.out.println("-----------------------------------------------------------\n");

        // Reverse int
        System.out.println("---Integer Reversal---");
        int num1 = 123, num2 = 700, num3 = -51, num4 = -100;
        int reverseInt = ri.reverseInt(num1);
        System.out.println(num1 + " -- is REVERSED to --> " + reverseInt);
        reverseInt = ri.reverseInt(num2);
        System.out.println(num2 + " -- is REVERSED to --> " + reverseInt);
        reverseInt = ri.reverseInt(num3);
        System.out.println(num3 + " -- is REVERSED to --> " + reverseInt);
        reverseInt = ri.reverseInt(num4);
        System.out.println(num4 + " -- is REVERSED to --> " + reverseInt);
        System.out.println("-----------------------------------------------------------\n");

        // MaxChar
        System.out.println("---Max Chars---");
        Character c = mxc.maxChar("apple");
        System.out.println("maxChar in \"apple\" : " + c);
        System.out.println("-----------------------------------------------------------\n");

        // FizzBuzz
        System.out.println("---FizzBuzz---");
        fzbz.fizzBuzz(3);
        System.out.println();
        fzbz.fizzBuzz(5);
        System.out.println("\n--Recursive FizzBuzz---");
        //fzbz.recursiveFizzBuzz(15);
        System.out.println("-----------------------------------------------------------\n");


    } // end main()
} // end Main Class
