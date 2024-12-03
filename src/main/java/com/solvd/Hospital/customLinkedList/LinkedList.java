package com.solvd.Hospital.customLinkedList;

public class LinkedList<T> {
    private Node<T> head;

    // Constructor
    public LinkedList() {
        head = null;
    }


    public void add(T data) {
        Node<T> newNode = new Node<>(data);
        if (head == null) {
            head = newNode;
        } else {
            Node<T> current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }


    public void remove(int id) {
        if (head == null) {
            System.out.println("The list is empty.");
            return;
        }

        if (((Patient) head.data).getId() == id) {
            head = head.next;
            return;
        }

        Node<T> current = head;
        while (current.next != null && ((Patient) current.next.data).getId() != id) {
            current = current.next;
        }

        if (current.next == null) {
            System.out.println("Patient with ID " + id + " not found.");
        } else {
            current.next = current.next.next;  // Remove the node
        }
    }


    public void printList() {
        if (head == null) {
            System.out.println("The list is empty.");
            return;
        }

        Node<T> current = head;
        while (current != null) {
            System.out.println(current.data);
            current = current.next;
        }
    }

    public int size() {
        int size = 0;
        Node<T> current = head;
        while (current != null) {
            size++;
            current = current.next;
        }
        return size;
    }
}