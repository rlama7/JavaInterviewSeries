/**
 * Node.java         -A program to represent a node for a tree data structure.
 * @authoer          Ratna Lama
 * @version          1.0
 * @since            08/07/2019
 *
 * @description:
 * Implementation of node for a Tree Data structure.
 * Create a Node class
 * Create a Tree class
 * Implement BreadthFirstSearch
 * Implement DepthFirstSearch
 *
 * Time Complexity for Search and Access:
 * Time Complexity for Insertion and Deletion:
 */
package com.ratnalama;

public class Node {
    private int key;
    private String value;
    private Node left, right;

    // Constructor
    public Node(int key, String value) {
        this.key = key;
        this.left = this.right = null;
        this.value = value;
    } // end Constructor

    /**-------------------------GETTERS AND SETTERS-------------------------------------------------------------------*/
    public int getKey() {
        return key;
    }
    public void setKey(int key) {
        this.key = key;
    }
    public String getValue() {
        return value;
    }
    public void setValue(String value) {
        this.value = value;
    }
    public Node getLeft() {
        return left;
    }
    public void setLeft(Node left) {
        this.left = left;
    }
    public Node getRight() {
        return right;
    }
    public void setRight(Node right) {
        this.right = right;
    }
} // end Node Class
