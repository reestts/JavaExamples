package com.reestts.datastructures.tree;

public class BinaryTree {

    Node root;

    public void traverseTree(Node node) {
        if (node != null) {
            traverseTree(node.left);
            System.out.print(" " + node.value);
            traverseTree(node.right);
        }
    }

    public void insert(Node node, int value) {
        if (value < node.value) {
            if (node.left != null) {
                insert(node.left, value);
            } else {
                System.out.println(" Inserted " + value + " to left of " + node.value);
                node.left = new Node(value);
            }
        } else {
            if (value > node.value) {
                if (node.right != null) {
                    insert(node.right, value);
                } else {
                    System.out.println("  Inserted " + value + " to right of " + node.value);
                    node.right = new Node(value);
                }
            }
        }
    }

    public void traverseInOrder(Node node) {
        if (node != null) {
            traverseInOrder(node.left);
            System.out.print(" " + node.value);
            traverseInOrder(node.right);
        }
    }
}
