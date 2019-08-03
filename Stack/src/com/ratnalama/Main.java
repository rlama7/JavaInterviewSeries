/**
 * Stack            -A driver program to implement a stack data structure. A stack data structure implements LIFO -
 *                   Last In First Out.
 * @authoer          Ratna Lama
 * @version          1.0
 * @since            07/30/2019
 *
 * @description:
 * Array implementation of Stack Data structure.
 */
package com.ratnalama;

public class Main {

    public static void main(String[] args) {
        System.out.println("\n-------------------------STACK---------------------------------------------------------");
        // initialization
        Stack s = new Stack(10);
        //push
        for (int i=10; i<100; i +=10) {
            s.push(i);
        }
        // print the stack
        while (!s.isEmpty()) {
            long value = s.pop();
            System.out.println("| " + value + " |");
        }
        System.out.print("=======");

        System.out.println("\n--------------------------REVERSE STRING-----------------------------------------------");
        ReverseString rs = new ReverseString(20);
        // push "hello"
        String word = "hello";
        for (int i=0; i< word.length(); i++) {
            rs.push(word.charAt(i));
        }
        // print the stack
        while (!rs.isEmpty()) {
            char item = rs.pop();
            System.out.print(item + " --> ");
        }

        System.out.println("\n---------------------QUEUE FROM STACK--------------------------------------------------");
        QueueStack qs = new QueueStack();
        for (int i=0; i<3; i++) {
            qs.enqueue(i);
        }
        while (!qs.isEmpty()) {
            System.out.print(qs.peek() + " ");
        }
    } // end main()
} // end Main Class
