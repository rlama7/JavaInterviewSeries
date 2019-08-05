/**
 * DoublyLinkedList.java        -A program to represent a Doubly Linked List class utilizing Node Class
 * @authoer                      Ratna Lama
 * @version                      1.0
 * @since                        08/04/2019
 *
 * @description:
 * Implementation of Doubly Linked List Data structure: Singly/Double/Circular Linked List
 * Time Complexity for Search and Access: O(n)
 * Time Complexity for Insertion and Deletion: O(1) *
 */

package com.ratnalama;

public class DoublyLinkedList {
    private Node head;
    private Node last;

    // Constructor
    public DoublyLinkedList() {
        this.head = null;
        this.last = null;
    } // end Constructor

    // isEmpty()
    public boolean isEmpty() {
        return (this.head == null);
    } // end isEmpty()

    // insertFirst()
    public void insertFirst(int data) {
        Node newNode = new Node();
        newNode.setData(data);
        // check if the Linked List is empty
        if (isEmpty()) {
            last = newNode; // if empty, last will refer to the newNode being created
        } else {
            head.setPrevious(newNode);
        }
        newNode.setNext(head); // the new node's next field will point to the old first
        this.head = newNode;
    } // end insertFirst()

    // insertLast()
    public void insertLast(int data) {
        Node newNode = new Node();
        newNode.setData(data);
        if (isEmpty()) {
            head = newNode;
        } else {
            last.setNext(newNode);  // assign old last to the newNode
            newNode.setPrevious(last); // the old last will be the newNode's previous
        }
        last = newNode; // update the Linked list's last field to point to the newNode
    } // end insertLast()

    // assume non-empty list
    // deleteFirst()
    public Node deleteFirst() {
        Node temp = head;
        // single node case
        if (head.getNext() == null) {
            last = null;
        } else {
            // more than a single node case
            head.getNext().setPrevious(null);   // the list's head node will point to null
        }
        head = head.getNext(); // head now points to the old head's next field
        return temp;
    } // end deleteFirst()

    // deleteLast()
    public Node deleteLast() {
        Node temp = last;
        // single node case
        if (head.getNext() == null) {
            head = null;
        } else {
            // more than a single node present in the chain
            last.getPrevious().setNext(null); // the last node's previous node's next field will point to null
        }
        last = last.getPrevious();
        return temp;
    } // end deleteLast()

} // end DoublyLinkedList Class
