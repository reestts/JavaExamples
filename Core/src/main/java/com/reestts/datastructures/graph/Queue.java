package com.reestts.datastructures.graph;

public class Queue {

    GraphNode first;
    GraphNode last;

    public void enqueue(GraphNode n) {
        if (first == null) {
            first = n;
            last = first;
        } else {
            last.next = n;
            last = n;
        }
    }

    public GraphNode dequeue() {
        if (first == null) {
            return null;
        } else {
            GraphNode temp = new GraphNode(first.val, first.neighbors);
            first = first.next;
            return temp;
        }
    }
}
