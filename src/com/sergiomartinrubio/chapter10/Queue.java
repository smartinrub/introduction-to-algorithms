package com.sergiomartinrubio.chapter10;

import java.util.Arrays;

public class Queue<E> {

    private E[] array;
    private int tail = 0;
    private int head = 0;

    public Queue() {
        array = (E[]) new Object[10];
    }

    // O(1)
    public void enqueue(E e) {
        if (isFull()) {
            array = Arrays.copyOf(array, array.length * 2);
        }
        array[tail++] = e;
    }

    // O(1)
    public E dequeue() {
        if (isEmpty()) {
            return null;
        }
        return array[head++];
    }

    public boolean isFull() {
        return array.length == tail;
    }

    public boolean isEmpty() {
        return array.length == 0;
    }
}
