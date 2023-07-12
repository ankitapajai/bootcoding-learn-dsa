package com.bootcoding.dsa.linked_list;

public class LinkedList {
    private Node head;

    public LinkedList(){
        this.head = null;
    }

    public void insertElement(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        }else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }

    }
    public void display(){
        Node current = head;
        while (current != null) {
            System.out.println(current.data);
            current = current.next;
        }
    }
}
