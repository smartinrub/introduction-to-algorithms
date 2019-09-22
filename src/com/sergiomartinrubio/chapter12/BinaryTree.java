package com.sergiomartinrubio.chapter12;

public class BinaryTree {

    private Node root;

    private static class Node<T> {
        int value;
        Node left;
        Node right;
        Node parent;

        private Node(int value) {
            this.value = value;
        }
    }

    public void insert(int value) {
        Node newNode = new Node(value);
        Node current = root;
        Node leaf = null;

        while (current != null) {
            leaf = current;
            if (newNode.value < current.value) {
                current = current.left;
            } else {
                current = current.right;
            }
        }
        newNode.parent = leaf;

        if (leaf == null) {
            root = newNode;
        } else if (newNode.value < leaf.value) {
            leaf.left = newNode;
        } else {
            leaf.right = newNode;
        }
     }

     public boolean contains(int value) {
        return recursiveSearch(root, value) != null;
     }

     private Node recursiveSearch(Node current, int value) {
        if (current == null || value == current.value) {
            return current;
        } else if (value < current.value) {
            return recursiveSearch(current.left, value);
        } else {
            return recursiveSearch(current.right, value);
        }
     }

     public int minimum() {
         return findMinimum(root).value;
     }

    private Node findMinimum(Node root) {
        Node current = root;
        while (current.left != null) {
            current = current.left;
        }
        return current;
    }

    public int maximum() {
        return findMaximum(root).value;
    }

    private Node findMaximum(Node root) {
        Node current = root;
        while (current.right != null) {
            current = current.right;
        }
        return current;
    }

    public void delete(int value) {
        deleteNode(root, value);
    }

    private void deleteNode(Node root, int value) {
        Node nodeToDelete = recursiveSearch(root, value);
        if (nodeToDelete.left == null) {
            transplant(nodeToDelete, nodeToDelete.right);
        } else if (nodeToDelete.right == null) {
            transplant(nodeToDelete, nodeToDelete.left);
        } else {
            Node min = findMinimum(nodeToDelete.right);
            if (min.parent != nodeToDelete) {
                transplant(min, min.right);
                min.right = nodeToDelete.right;
                min.right.parent = min;
            }
            transplant(nodeToDelete, min);
            min.left = nodeToDelete.left;
            min.left.parent = min;
        }
    }

    private void transplant(Node nodeToDelete, Node childNode) {
        if (nodeToDelete.parent == null) {
            root = childNode;
        } else if (nodeToDelete == nodeToDelete.parent.left) {
            nodeToDelete.parent.left = childNode;
        } else {
            nodeToDelete.parent.right = childNode;
        }
        if (childNode != null) {
            childNode.parent = nodeToDelete.parent;
        }
    }
}
