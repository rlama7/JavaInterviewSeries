/**
 * CircularLinkedList.java       -A program to represent a Circular Linked List class utilizing Node Class
 * @authoer                      Ratna Lama
 * @version                      1.0
 * @since                        08/04/2019
 *
 * @description:
 * Implementation of Circular Linked List Data structure: Singly/Double/Circular Linked List
 * Time Complexity for Search and Access: O(n)
 * Time Complexity for Insertion and Deletion: O(1) *
 */
package com.ratnalama;

public class CircularLinkedList {
    private Node head;
    private Node last;
    // Constructor
    public CircularLinkedList() {
        head = null;
        last = null;
    } // end Constructor

    // isEmpty() checks if the Circular Linked List is empty
    public boolean isEmpty() {
        return (head == null);
    } // end isEmpty()

    // insertFirst()
    public void insertFirst(int data) {
        Node current = new Node();
        current.setData(data);
        if (isEmpty()) {
            last = current;
        }
        current.setNext(head);
        head = current;
    } // end insertFirst()

    // insertLast()
    public void insertLast(int data) {
        Node newNode = new Node();
        newNode.setData(data);
        if (isEmpty()) {
            head = newNode;
        } else {
            last.setNext(newNode); // the next value of the last node will point to the new node
            last = newNode;       // make the new node we created to be the last node in the list
        }
    } // end insertLast()

    // deleteFirst()
    public int deleteFirst() {
        int temp = head.getData();
        // if the LinkedList is empty
        if (head.getNext() == null) {
            last = null;
        }
        head = head.getNext();  // head will point to the old's next value
        return temp;
    } // end deleteFirst()

    // display() displays the LinkedList
    public void display() {
        System.out.println("Linked List (first --> last) ");
        System.out.print("[ ");
        Node current = head;
        while (current != null) {
            current.displayNode();
            current = current.getNext();
        }
        System.out.print("null ]");
    } // end displayList()

} // end CircularLinkedList Class
