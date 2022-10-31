package com.reestts.algorithm;

public class GraphNode {

    int value;
    GraphNode next;
    GraphNode[] neighbors;
    boolean isVisited;

    GraphNode(int x) {
        value = x;
    }

    GraphNode(int x, GraphNode[] n) {
        value = x;
        neighbors = n;
    }

    public String toString() {
        return "value: " + this.value;
    }
}
