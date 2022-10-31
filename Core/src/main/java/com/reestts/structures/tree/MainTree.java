package com.reestts.structures.tree;

public class MainTree {

    public static void main(String[] args) {
        // create an object of BinaryTree
        BinaryTree tree = new BinaryTree();

        // create nodes of the tree
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);

        System.out.print("\nBinary Tree: ");
        tree.traverseTree(tree.root);

//        Node tree = new Node();
//        Node root = new Node(5);
//        System.out.println("Binary Tree Example");
//        System.out.println("Building tree with root value " + root.value);
//        tree.insert(root, 2);
//        tree.insert(root, 4);
//        tree.insert(root, 8);
//        tree.insert(root, 6);
//        tree.insert(root, 7);
//        tree.insert(root, 3);
//        tree.insert(root, 9);
//        System.out.println("Traversing tree in order");
//        tree.traverseLevelOrder();

    }
}
