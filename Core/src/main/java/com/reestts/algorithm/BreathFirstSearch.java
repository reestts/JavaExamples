package com.reestts.algorithm;

public class BreathFirstSearch {

    public static void main(String[] args) {
        GraphNode n1 = new GraphNode(1);
        GraphNode n2 = new GraphNode(2);
        GraphNode n3 = new GraphNode(3);
        GraphNode n4 = new GraphNode(4);
        GraphNode n5 = new GraphNode(5);

        n1.neighbors = new GraphNode[]{n2, n3, n5};
        n2.neighbors = new GraphNode[]{n1, n4};
        n3.neighbors = new GraphNode[]{n1, n4, n5};
        n4.neighbors = new GraphNode[]{n2, n3, n5};
        n5.neighbors = new GraphNode[]{n1, n3, n4};

        breathFirstSearch(n1, 5);
    }

    public static void breathFirstSearch(GraphNode root, int searchValue) {
        if (root.value == searchValue) {
            System.out.println("find in root");
        }

        Queue queue = new Queue();
        root.isVisited = true;
        queue.enqueue(root);

        while (queue.first != null) {
            GraphNode c = queue.dequeue();
            for (GraphNode n : c.neighbors) {
                if (!n.isVisited) {
                    System.out.println(n + " ");
                    n.isVisited = true;
                    if (n.value == searchValue) {
                        System.out.println("Find " + n);
                    }
                    queue.enqueue(n);
                }
            }
        }
    }
}
