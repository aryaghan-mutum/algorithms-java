package com.algorithms.collections.linkedlist;

public class Node {

    public int data;
    public Node next;

    public Node() {

    }
    public Node(int data, Node next) {
        this.data = data;
        this.next = next;
    }

    public String toString() {
        return data + "";
    }
}
