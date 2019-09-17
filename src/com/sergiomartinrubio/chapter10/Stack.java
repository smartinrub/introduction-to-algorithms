package com.sergiomartinrubio.chapter10;

import java.util.Arrays;

public class Stack<E> {

    private E[] array;
    private int top = 0;

    public Stack() {
        array = (E[]) new Object[10];
    }

    public void push(E e) {
        if (isFull()) {
            array = Arrays.copyOf(array, array.length * 2);
        }
        array[top++] = e;
    }

    public E pop() {
        if (isEmpty()) {
            return null;
        }
        E e = array[top - 1];
        array[top--] = null;
        return e;
    }

    public boolean isFull() {
        return array.length == top;
    }

    public boolean isEmpty() {
        return array.length == 0;
    }
}
