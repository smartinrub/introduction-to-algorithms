package com.sergiomartinrubio.chapter10;

public class Main {

    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.push(3);
        stack.push(5);
        stack.push(9);
        stack.push(1);

        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());

        Queue queue = new Queue();
        queue.enqueue(3);
        queue.enqueue(5);
        queue.enqueue(9);
        queue.enqueue(1);

//        System.out.println(queue.dequeue());
//        System.out.println(queue.dequeue());
//        System.out.println(queue.dequeue());
//        System.out.println(queue.dequeue());
    }
}
