package com.sergiomartinrubio.chapter10;

import java.util.Arrays;

public class Deque<E> {

    private E[] array;
    private int tail = 0;
    private int head = 0;

    public Deque() {
        array = (E[]) new Object[10];
    }

    // O(n)
    public void insertFront(E e) {
        if (isFull()) {
            array = Arrays.copyOf(array, array.length * 2);
        }
        if (head == tail) {
            array[head] = e;
            tail++;
        } else {
            for (int i = tail; i > head; i--) {
                array[i] = array[i - 1];
            }
            tail++;
            array[head] = e;
        }
    }

    // O(1)
    public void insertLast(E e) {
        if (isFull()) {
            array = Arrays.copyOf(array, array.length * 2);
        }
        array[tail++] = e;
    }

    // O(1)
    public E getFront() {
        if (isEmpty()) {
            return null;
        }
        return array[head];
    }

    // O(1)
    public E getRear() {
        if (isEmpty()) {
            return null;
        }
        if (tail == array.length - 1) {
            return array[tail];
        }
        return array[tail - 1];
    }

    // O(1)
    public void deleteFront() {
        if (isEmpty()) {
            return;
        }
        head++;
    }

    // O(1)
    public void deleteRear() {
        if (isEmpty()) {
            return;
        }
        tail--;
    }

    public boolean isFull() {
        return array.length == tail;
    }

    public boolean isEmpty() {
        return array.length == 0;
    }
}
