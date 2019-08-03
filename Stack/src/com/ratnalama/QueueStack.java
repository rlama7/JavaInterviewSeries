/**
 * QueueStack.java  -A program to implement a queue data structure using two stacks.
 *                   A Queue data structure implements FIFO - First In First Out.
 *                   Do not create an array inside of the Queue Class
 * @authoer          Ratna Lama
 * @version          1.0
 * @since            08/03/2019
 *
 * @description:
 * Queue implementation using two Stack Data structure.
 * Time Complexity for Search and Access: O(n)
 * Time Complexity for Insertion and Deletion: O(1) *
 */

package com.ratnalama;

public class QueueStack {
    private Stack first;
    private Stack second;
    private int size;
    // Constructor
    public QueueStack() {
        first = new Stack(size);
        second = new Stack(size);
    } // end constructor

    // enqueue()
    public void enqueue(int item) {
        this.first.push(item);
    } // end enqueue()

    /**
     * dequeue() removes item from the front of the queue
     * @return item to be removed from the queue
     */
    public int dequeue() {
        // until the first stack is not empty take the item from the first and push it to the second stack
        while (!this.first.isEmpty()) {
            this.second.push(this.first.pop());
        }
        int tempItem = (int) this.second.pop();

        // remove items from the second stack to the first to get back to the original state
        while (!this.second.isEmpty()) {
            this.first.push(this.second.pop());
        }

        return tempItem;
    } // end dequeue()

    // peek()
    public int peek() {
        // move items from first to second
        while (!this.first.isEmpty()) {
            this.second.push(this.first.pop());
        }
        int peekItem = (int) this.second.peek();

        // move back the items from second to first
        while (!this.second.isEmpty()) {
            this.first.push(this.second.pop());
        }
        return peekItem;
    } // peek()

    // isEmpty()
    public boolean isEmpty() {
        return (this.first.isEmpty() && this.second.isEmpty());
    } // end isEmpty()

    // isFull()
    public boolean isFull() {
        return (this.first.isFull() && this.second.isFull());
    } // end isFull()

} // end QueueStack
