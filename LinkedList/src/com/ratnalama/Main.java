/**
 * Main.java        -A program to implement a linked list data structure.
 * @authoer          Ratna Lama
 * @version          1.0
 * @since            08/04/2019
 *
 * @description:
 * Implementation of Linked List Data structure: Singly/Double/Circular Linked List
 * Time Complexity for Search and Access: O(n)
 * Time Complexity for Insertion and Deletion: O(1) *
 */

package com.ratnalama;

public class Main {

    public static void main(String[] args) {
        System.out.println("\n---------------------------------------------------------------------------------------");
        // instantiate Node and assign a value
        Node nodeA = new Node();
        Node nodeB = new Node();
        Node nodeC = new Node();
        Node nodeD = new Node();
        // set data to each node
        nodeA.setData(10);
        nodeB.setData(20);
        nodeC.setData(30);
        nodeD.setData(40);
        nodeD.displayNode();
//        view(nodeD);
        System.out.println();
        // link all the nodes
        nodeA.setNext(nodeB);
        nodeB.setNext(nodeC);
        nodeC.setNext(nodeD);
        // print length
        System.out.println(length(nodeA));  // 4
        System.out.println(length(nodeD)); // 3

        System.out.println("\n-----------------------SINGLY LINKED LIST----------------------------------------------");
        SinglyLinkedList sl = new SinglyLinkedList();
        for (int i=10; i<=50; i +=10) {
            sl.insertFirst(i);
        }
        sl.displayList();

        // deleteFirst()
        System.out.println("\n--------------After call to deleteFirst()--------------");
        sl.deleteFirst();
        sl.displayList();

        // insertLast()
        System.out.println("\n--------------After call to insertLast()--------------");
        sl.insertLast(100);
        sl.insertLast(200);
        sl.displayList();

        System.out.println("\n\n----------------CIRCULAR LINKED LIST--------------------------------------------------");
        CircularLinkedList cl = new CircularLinkedList();
        for (int i=10; i<=100; i+=10) {
            cl.insertFirst(i);
        }
        cl.display();

        System.out.println("\n--------------After call to deleteFirst()--------------");
        cl.deleteFirst();
        cl.display();

        // insertLast()
        System.out.println("\n--------------After call to insertLast()--------------");
        cl.insertLast(100);
        cl.insertLast(200);
        cl.display();
        System.out.println("\n---------------------------------------------------------------------------------------");
    } // end main()

    // find the Length of the Node
    public static int length(Node node) {
        int counter = 0;
        Node current = node;
        while (current != null) {
            counter++;
            current = current.getNext();
        }
        return counter;
    } // end length()

    // print Node
    public static void view(Node node) {
        Node current = node;
        while (current != null) {
            System.out.print(current.getData() + " --> ");
            current = current.getNext();
        }
    } // end view()
} // end Main Class
