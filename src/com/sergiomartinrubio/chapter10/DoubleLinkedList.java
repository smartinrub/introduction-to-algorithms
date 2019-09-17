package com.sergiomartinrubio.chapter10;

public class DoubleLinkedList<T> {

    private Node<T> head;
    private Node<T> tail;

    static class Node<T> {
        T e;
        Node<T> prev;
        Node<T> next;

        public Node(T e) {
            this.e = e;
        }
    }

    // O(1)
    public void insert(T e) {
        if (head != null) {
           tail.next = new Node<>(e);
           tail.next.prev = tail;
           tail = tail.next;
        } else {
            tail = new Node<>(e);
            head = tail;
        }
    }

    // O(1)
    public void delete() {
        if (tail != null) {
            tail = tail.prev;
            tail.next = null;
        }
    }

    // O(n)
    public void delete(int index) {
        Node<T> temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        if (temp.prev != null) {
            temp.prev.next = temp.next;
        } else {
            head = temp.next;
        }
        if (temp.next != null) {
            temp.next.prev = temp.prev;
        } else {
            tail = temp.prev;
        }
    }

    // O(n)
    public T search(int index) {
        Node<T> temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
            if (temp == null) {
                return null;
            }
        }
        return temp.e;
    }

}
