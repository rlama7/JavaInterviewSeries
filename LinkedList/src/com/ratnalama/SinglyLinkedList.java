/**
 * SinglyLinkedList.java        -A program to represent a Singly Linked List class utilizing Node Class
 * @authoer                      Ratna Lama
 * @version                      1.0
 * @since                        08/04/2019
 *
 * @description:
 * Implementation of Singly Linked List Data structure: Singly/Double/Circular Linked List
 * Time Complexity for Search and Access: O(n)
 * Time Complexity for Insertion and Deletion: O(1) *
 */
package com.ratnalama;

public class SinglyLinkedList {
    private Node head;  // head node

    // Constructor
    public SinglyLinkedList() {
    } // end Constructor

    // isEmpty()
    public boolean isEmpty() {
        return (head == null);
    } // end isEmpty()

    // insertFirst() inserts the node at the beginning index 0
    public void insertFirst(int data) {
        Node newNode = new Node();
        newNode.setData(data);
        newNode.setNext(head); // new node's next filed points to the old head
        head = newNode;       // head now points to the new node
    } // end insertFirst()

    // deleteFirst() deletes the node at the beginning index 0 and returns the node
    public Node deleteFirst() {
        Node tempNode = head;
        head = head.getNext();
        return tempNode;
    } // end deleteFirst()

    // insertLast() inserts node at the end of the Linked List chain
    public void insertLast(int data) {
        Node current = head;
        while (current.getNext() != null) {
            current = current.getNext();
        }
        Node lastNode = new Node();
        lastNode.setData(data);
        current.setNext(lastNode);
    } // end insertLast()

    // display() displays the LinkedList
    public void displayList() {
        System.out.println("Linked List (first --> last) ");
        System.out.print("[ ");
        Node current = head;
        while (current != null) {
            current.displayNode();
            current = current.getNext();
        }
        System.out.print("null ]");
    } // end displayList()

} // end SinglyLinkedList Class
