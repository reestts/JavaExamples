package com.reestts.structures.stack;

public class Stack {

    Node top;

    public Node peek() {
        if (top != null) {
            return top;
        }
        return null;
    }

    public Node pop() {
        if (top == null) {
            return null;
        } else {
            Node temp = new Node(top.value);
            top = top.next;
            return temp;
        }
    }

    public void push(Node node) {
        if (node != null) {
            node.next = top;
            top = node;
        }
    }
}
