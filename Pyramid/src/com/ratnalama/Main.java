
package com.ratnalama;

import org.w3c.dom.ls.LSOutput;

public class Main {

    public static void main(String[] args) {
        System.out.println("\n---------------------------------------------------------------------------------------");
        trianglePyramid(20);
        System.out.println("\n---------------------------------------------------------------------------------------");
    } // end main()

    // iterative trianglePyramid
    public static void trianglePyramid(int num) {
        int midPoint = ((2 * num -1) / 2);
        for (int row = 0; row < num; row++) {
            String level = "";
            for (int col = 0; col < (2 * num - 1); col++) {
                if (midPoint - row <= col && midPoint + row >= col) {
                    level += "*";
                } else {
                    level += " ";
                }
            }
            System.out.println(level);
        }
    } // end trianglePyramid()


    // recursive trianglePyramid
} // end Main Class
