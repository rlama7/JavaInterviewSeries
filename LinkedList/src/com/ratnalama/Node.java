/**
 * Node.java        -A program to represent a Node class
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

import org.w3c.dom.ls.LSOutput;

import javax.crypto.spec.PSource;

public class Node {
    private int data;
    private Node next = null;
    private Node previous;

    // display node data
    public void displayNode() {
        System.out.print(data + "-->" );
    } // end displayNode()

    /**-------------------GETTERS AND SETTERS-------------------------------------------------------------------------*/

    public int getData() {
        return data;
    }
    public void setData(int data) {
        this.data = data;
    }
    public Node getNext() {
        return next;
    }
    public void setNext(Node next) {
        this.next = next;
    }
    public Node getPrevious() {
        return previous;
    }
    public void setPrevious(Node previous) {
        this.previous = previous;
    }
} // end Node Class
