/**
 * Queue.java        -A driver program to implement a Queue data structure. A Queue data structure implements FIFO -
 *                    FIFO In First Out.
 * @authoer           Ratna Lama
 * @version           1.0
 * @since             07/30/2019
 *
 * @description:
 * Array implementation of Queue Data structure.
 */

package com.ratnalama;

public class Main {

    public static void main(String[] args) {
        System.out.println("\n---------------------QUEUE-------------------------------------------------------------");
        // instantiation
        Queue q = new Queue(10);
        Queue q1 = new Queue(5);
        Queue q2 = new Queue(5);
        Queue q3;

        // enqueue q
        for (int i=10; i<=100; i +=10) {
            q.enqueue(i);
        }
        System.out.println("Is Queue Empty: " + q.isEmpty());
        System.out.println("Is Queue Full: " + q.isFull());
        System.out.println("Queue peek: " + q.peek());
        // print
        System.out.println("Print out Queue after enqueue");
        q.view();
        System.out.println();

        // dequeue
        System.out.println("Print out Queue after dequeue");
        System.out.print("[ ");
        for (int i=0; i<5; i++) {
            System.out.print(q.dequeue() + " ");
        }
        System.out.println("]");
        System.out.println("\n-----------------------QUEUE WEAVE-----------------------------------------------------");
        // enqueue q1
        for (int i=1; i<=10; i++) {
            if (i % 2 == 0) {
                q1.enqueue(i);      // enqueue even
            }
            if ( !(i % 2 == 0)) {
                q2.enqueue(i);  // enqueue odd
            }
        }
        System.out.println();
        q.view();
        System.out.println();
        q1.view();
        System.out.println();
        q2.view();
        System.out.println("\n");

        Weave w = new Weave();
        q3 = w.weaveQ(q1, q2);
        q3.view();
    }
}
