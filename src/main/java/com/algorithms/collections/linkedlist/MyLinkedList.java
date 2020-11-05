package com.algorithms.collections.linkedlist;

import java.util.HashMap;

public class MyLinkedList {

    Node head;

    public void insert(int data) {
        Node node = new Node();
        node.data = data;

        if(head == null) {
            head = node;
        } else {
            Node n = head;
            while(n.next != null) {
                n = n.next;
            }
            n.next = node;
        }

    }

    public static void main(String[] args) {
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.insert(5);
    }


}
