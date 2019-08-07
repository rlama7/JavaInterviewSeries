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
            // more than a single node present in
            // the last node's previous node's next field will point to null
        }
        last = last.getPrevious();
        return temp;
    } // end deleteLast()

    // insertAfter() -inserts a node after a particular key
    public boolean insertAfter(int key, int data) {
        Node current = head;    // start from the beginning of the list
        // iterate through the chain until we find the key
        while (current.getData() != key) {
            current = current.getNext();
            // we reached the end of the loop and couldn't find the key
            if (current == null) {
                return false;
            }
        }
        Node newNode = new Node();
        newNode.setData(data);

        // if the node is the last one in the LinkedList chain then update the last node
        if (current == last) {
            current.setNext(null);
            last = newNode;
        } else {
            // some where in the middle of the Linked List chain
            // newNode's next field should point to the old current note's next field
            newNode.setNext(current.getNext());
            // old current's next node's previous field should now point to the newNode.
            current.getNext().setPrevious(newNode);
        }
        // newNode's previous should point to the current
        newNode.setPrevious(current);
        current.setNext(newNode);
        return true;    // if we've made this far then we successfully made the insertion after a key
    } // end insertAfter()

    // deleteKey() - deletes a node with a particular key data
    public Node deleteKey(int key) {
        Node current = head;    // start from the beginning of the LinkedList chain
        Node tempNode;
        // iterate through the chain until we find the node with key data to be deleted
        while (current.getData() != key) {
            current = current.getNext();    // advance to the next node
            // we've reached the end of the linkedList chain and we didn't find the key
            if (current == null) {
                return null;
            }
        }
        /**
         * At this stage we've found the Node with matching key
          */

        // check if the Node is the first Node
        if (current == head) {
            head = current.getNext();   // link the head to the next node of the current's node
        } else {
            current.getPrevious().setNext(current.getNext());
        }

        // check if the Node is the last Node
        if (current == last) {
            last = current.getPrevious();
        } else {
            current.getNext().setPrevious(current.getPrevious());
        }
        return current;
    } // end deleteKey()

    // displayForward()
    public void displayForward() {
        Node current = head;
        System.out.println("Display Forward");
        System.out.println("Doubly Linked List (first --> last)");
        while (current.getNext() != null) {
            current.displayNode();
            current = current.getNext();
        }
        System.out.print("null " + "\n");
    } // end displayForward()

    // displayBackward()
    public void displayBackward() {
        Node current = last;
        System.out.println("Display Backward");
        System.out.println("Doubly Linked List (last --> first)");
        while (current.getPrevious() != null) {
            current.displayNode();
            current = current.getPrevious();
        }
        System.out.print("null" + "\n");

    } // end displayBackward()

} // end DoublyLinkedList Class
