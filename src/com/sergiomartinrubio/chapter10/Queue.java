package com.sergiomartinrubio.chapter10;

import java.util.Arrays;

public class Queue<E> {

    private E[] array;
    private int tailIndex = 0;

    public Queue() {
        array = (E[]) new Object[10];
    }

    public void enqueue(E e) {
        if (isFull()) {
            array = Arrays.copyOf(array, array.length * 2);
        }
        array[tailIndex++] = e;
    }

    public E dequeue() {
        if (isEmpty()) {
            return null;
        }
        E e = array[0];
        for (int i = 0; i < tailIndex; i++) {
            array[i] = array[i + 1];
        }
        return e;
    }

    public boolean isFull() {
        return array.length == tailIndex;
    }

    public boolean isEmpty() {
        return array.length == 0;
    }
}
