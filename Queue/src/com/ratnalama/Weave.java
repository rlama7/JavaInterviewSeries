/**
 * Weave.java        -A program to implement a Queue data structure to weave through the queue 1 and queue 2 as a source
 *                    and input data tot he queue 3 in alternative sequence
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

public class Weave {
    private int size = 10;
    private Queue q3 = new Queue(size);

    public Queue weaveQ(Queue q1, Queue q2) {
        // while the array size is not empty or full
        while (!(q1.isEmpty() || q2.isEmpty())) {
            if (!q1.isEmpty()) {
                q3.enqueue(q1.peek());
            }
            if (!q2.isEmpty()) {
                q3.enqueue(q2.peek());
            }
        }
        return q3;
    } // end weaveQ()
} // end Weave Class
