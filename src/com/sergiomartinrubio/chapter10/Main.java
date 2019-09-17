package com.sergiomartinrubio.chapter10;

public class Main {

    public static void main(String[] args) {
//        Stack<Integer> stack = new Stack<>();
//        stack.push(3);
//        stack.push(5);
//        stack.push(9);
//        stack.push(1);
//
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
//
//        Queue<Integer> queue = new Queue<>();
//        queue.enqueue(3);
//        queue.enqueue(5);
//        queue.enqueue(9);
//        queue.enqueue(1);
//
//        System.out.println(queue.dequeue());
//        System.out.println(queue.dequeue());
//        System.out.println(queue.dequeue());
//        System.out.println(queue.dequeue());
//
//        Deque<Integer> deque = new Deque<>();
//        deque.insertFront(3);
//        deque.insertFront(5);
//        deque.insertFront(9);
//        deque.insertFront(1);
//        deque.insertLast(8);
//
//        System.out.println(deque.getFront());
//        System.out.println(deque.getRear());
//
//        deque.deleteFront();
//        deque.deleteRear();
//        System.out.println(deque.getFront());
//        System.out.println(deque.getRear());
//
//        deque.deleteRear();
//        System.out.println(deque.getRear());


        DoubleLinkedList<Integer> doubleLinkedList = new DoubleLinkedList<>();
        doubleLinkedList.insert(3);
        doubleLinkedList.insert(5);
        doubleLinkedList.insert(9);
        doubleLinkedList.delete();
        doubleLinkedList.delete(0);

        System.out.println(doubleLinkedList.search(0));
    }
}
