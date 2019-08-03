/**
 * ReverseString.java        -A program to reverse a string implementing a stack data structure. A stack data structure
 *                            implements LIFO - Last In First Out.
 * @authoer                   Ratna Lama
 * @version                   1.0
 * @since                     07/30/2019
 *
 * @description:
 * Array implementation of Stack Data structure.
 */
package com.ratnalama;

public class ReverseString {
    // Variable Declaration
    private int maxSize;
    private char[] stackArray;
    private int top;

    // Constructor
    public ReverseString(int size) {
        this.maxSize = size;
        this.stackArray = new char[maxSize];
        this.top = -1;
    } // end Constructor

    // push
    public void push(char item) {
        if (isFull()) {
            System.out.println("The Stack is Full...");
        } else {
            top++;
            stackArray[top] = item;
        }
    } // end push()

    // pop
    public char pop() {
        if (isEmpty()) {
            System.out.println("This stack is Empty...");
            return '*';
        } else {
            int old_top = top;
            top--;
            return stackArray[old_top];
        }
    } // end pop()

    // peek
    public char peek() {
        return stackArray[top];
    } // end peek()

    // isEmpty
    public boolean isEmpty() {
        return top == -1;
    }
    // isFull
    public boolean isFull() {
        return maxSize -1 == top;
    }
} // end ReverseString()
