/**
 * Queue.java        -A program to implement a Queue data structure. A Queue data structure implements FIFO -
 *                    FIFO In First Out.
 * @authoer           Ratna Lama
 * @version           1.0
 * @since             07/30/2019
 *
 * @description:
 * Array implementation of Queue Data structure.
 * Time Complexity for Search and Access: O(n)
 * Time Complexity for Insertion and Deletion: O(1) *
 */
package com.ratnalama;

public class Queue {
    // Variable Declaration
    private int front;  // front of the line queue
    private int rear;   // back of the line queue
    private int[] queueArray;   // array to hold the data
    private int maxSize;    // set number of array slots
    private int itemCount;  // counter to maintain the number of items in our queue

    // Constructor
    public Queue(int size) {
        this.maxSize = size;
        this.queueArray = new int[size];
        this.front = 0;    // initially the queue is empty - the index position of the first slot of the array
        this.rear = -1;    // initially the queue is empty
        this.itemCount = 0;
    } // end Constructor

    // enqueue an item to the rear of the Queue
    public void enqueue(int item) {
        // circular queue enqueue
        if (rear == maxSize -1) {
            rear = -1;
        }
        rear++;
        queueArray[rear] = item;
        itemCount++;

    } // end enqueue()

    // dequeue
    public int dequeue() {
        int item = queueArray[front];
        front++;
        if (front == maxSize) {
            front = 0;  // set the front to the 0th index so we can re use the array
        }
        itemCount--;
        return item;
    } // end dequeue()

    // peek
    public int peek() {
        return queueArray[front];
    } // end peek()

    // isEmpty
    public boolean isEmpty() {
        return itemCount == 0;
    } // end isEmpty()

    // isFull
    public boolean isFull() {
        return maxSize - 1 == itemCount;
    } // end isFull()

    // print
    public void view() {
        System.out.print("[ ");
        for (int i=0; i<queueArray.length; i++) {
            System.out.print(queueArray[i]+ " ");
        }
        System.out.print("]");
    }

} // end Queue Class
