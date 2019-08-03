/**
 * Stack.java        -A program to implement a stack data structure. A stack data structure implements LIFO -
 *                   Last In First Out.
 * @authoer          Ratna Lama
 * @version          1.0
 * @since            07/30/2019
 *
 * @description:
 * Array implementation of Stack Data structure.
 * Time Complexity for Search and Access: O(n)
 * Time Complexity for Insertion and Deletion: O(1) *
 */
package com.ratnalama;

public class Stack {
    // data declaration
    private int maxSize;
    private long[] stackArray;
    private int top;

    // Constructor
    public Stack(int size) {
        this.maxSize = size;
        this.stackArray = new long[maxSize];
        this.top = -1;  // initially the stack is empty;
    } // end Constructor

    // push
    public void push(long item) {
        if (isFull()) {
            System.out.println("The Stack is Full...");
        } else {
            top++;
            stackArray[top] = item;
        }
    } // end push()

    // pop
    public long pop() {
        if (isEmpty()) {
            System.out.println("The stack is Empty...");
            return-1;
        } else {
            int old_top = top;
            top--;
            return stackArray[old_top];
        }
    } // end pop()

    // peek
    public long peek() {
        return stackArray[top];
    } // end peek()

    // isEmpty()
    public boolean isEmpty() {
        return top == -1; // returns true if the top is empty
    } // end isEmpty()

    // isFull()
    public boolean isFull() {
        return top == maxSize - 1;
    } // end isFull()
} // end Stack Class
