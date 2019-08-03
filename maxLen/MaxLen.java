package com.ratnalama.maxLen;

import java.util.HashMap;

public class MaxLen {
    private HashMap<Integer, Integer> hmap;

    // constructor
    public MaxLen() {
        hmap = new HashMap<Integer, Integer>();
    }

    public int maxLen(int[] array) {
        int count = 0;

        for (int i = 0; i < array.length; i++) {
            int currentNum = array[i];

            if (hmap.containsKey(currentNum)) {
                hmap.put(currentNum, hmap.get(currentNum + 1));
                count++;
            } else {
                hmap.put(currentNum, 1);
            }
        }
        return count;
    }
}
