package com.reestts.collections;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class Palindrome {
    public static void main(String[] args) {
        String s = "level";
        List<Character> list = new LinkedList<>();
        for (char ch : s.toCharArray()) {
            list.add(ch);
        }
        ListIterator<Character> listIteratorFromStart = list.listIterator();
        ListIterator<Character> listIteratorFromEnd = list.listIterator(list.size());
        boolean isPalindrome = true;
        while (listIteratorFromStart.hasNext() && listIteratorFromEnd.hasPrevious()) {
            if (listIteratorFromStart.next() != listIteratorFromEnd.previous()) {
                isPalindrome = false;
                break;
            }
        }
        if (isPalindrome) {
            System.out.println("Is palindrome");
        } else {
            System.out.println("Is not palindrome");
        }
    }
}