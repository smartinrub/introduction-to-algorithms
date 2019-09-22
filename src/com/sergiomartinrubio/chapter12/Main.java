package com.sergiomartinrubio.chapter12;

public class Main {

    public static void main(String[] args) {
        BinaryTree binaryTree = new BinaryTree();
        binaryTree.insert(12);
        binaryTree.insert(18);
        binaryTree.insert(5);
        binaryTree.insert(15);
        binaryTree.insert(9);
        binaryTree.insert(2);
        binaryTree.insert(19);
        binaryTree.insert(17);

        System.out.println(binaryTree.contains(5));
        System.out.println(binaryTree.minimum());
        System.out.println(binaryTree.maximum());

        binaryTree.delete(5);
        System.out.println(binaryTree.contains(5));

    }
}
