package com.sergiomartinrubio.chapter10;

import java.util.Arrays;

public class Stack<E> {

    private E[] array;
    private int tailIndex = 0;

    public Stack() {
        array = (E[]) new Object[10];
    }

    public void push(E e) {
        if (isFull()) {
            array = Arrays.copyOf(array, array.length * 2);
        }
        array[++tailIndex] = e;
    }

    public E pop() {
        if (isEmpty()) {
            return null;
        }
        return array[tailIndex--];
    }

    public boolean isFull() {
        return array.length == tailIndex;
    }

    public boolean isEmpty() {
        return array.length == 0;
    }
}
