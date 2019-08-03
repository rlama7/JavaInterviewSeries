/**
 * MaxChars.java      --A program to find character(s) that is most commonly present in the given string.
 * @author			    Ratna Lama
 * @version   		    1.0
 * @since     		    12/29/2018
 */

package com.ratnalama.maxChars;

import java.util.HashMap;

public class MaxChars {
    private HashMap<Character, Integer> map;

    // Constructor
    public MaxChars() {
    }

    public Character maxChar(String str) {
        map = new HashMap<Character, Integer>();
        Character maxChar = ' ';
        long max = Integer.MIN_VALUE;
        for (int i = 0; i < str.length(); i++) {
            Character current = str.charAt(i);
            if (map.containsKey(current)) {
                map.put(current, map.get(current)+1);
            } else {
                map.put(current, 1);
            }
            if (map.get(current) > max) {
                maxChar = current;
                max = map.get(current);
            }
        }
        return maxChar;

    } // end maxChar()

} // end MaxChars Class
