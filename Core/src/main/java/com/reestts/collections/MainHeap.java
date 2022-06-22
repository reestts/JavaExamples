package com.reestts.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MainHeap {

    public static void main(String[] args) {
        List<Integer> heap = new ArrayList<>();

        add(heap, 2);
        add(heap, 5);
        add(heap, 3);
        add(heap, 10);
        add(heap, 6);
        add(heap, 9);
        add(heap, 5);
        add(heap, 12);
        add(heap, 40);

        System.out.println(top(heap)); //2
        erase(heap);
        System.out.println(top(heap)); //3
    }

    static void add(List<Integer> heap, Integer value) {
        heap.add(value);
        int index = heap.size() - 1;

        while (index != 1 && heap.get(index) < heap.get(index / 2)) {
            Collections.swap(heap, index, index / 2);
            index /= 2;
        }
    }

    static void erase(List<Integer> heap) {
        Collections.swap(heap, 1, heap.size() - 1);
        heap.remove(heap.size() - 1);

        int index = 1;
        while (index * 2 < heap.size() && heap.get(index) > heap.get(index * 2) ||
                index * 2 + 1 < heap.size() && heap.get(index) > heap.get(index * 2 + 1)) {

            if (index * 2 + 1 >= heap.size() || heap.get(index * 2) < heap.get(index * 2 + 1)) {
                Collections.swap(heap, index, index * 2);
                index *= 2;
            } else {
                Collections.swap(heap, index, index * 2 + 1);
                index *= 2;
                ++index;
            }
        }
    }

    static Integer top(List<Integer> heap) {
        return heap.get(1);
    }
}
