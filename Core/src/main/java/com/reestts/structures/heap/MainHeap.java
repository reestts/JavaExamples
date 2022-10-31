package com.reestts.structures.heap;

public class MainHeap {

    public static void main(String[] args) {
        Heap maxHeap = new Heap(10);

        maxHeap.insert(1);
        maxHeap.insert(2);
        maxHeap.insert(3);
        maxHeap.insert(4);
        maxHeap.insert(5);
        maxHeap.insert(6);
        maxHeap.insert(7);
        maxHeap.printHeap();

        int key = maxHeap.delete(5);
        System.out.println(key);
        maxHeap.printHeap();
    }
}
