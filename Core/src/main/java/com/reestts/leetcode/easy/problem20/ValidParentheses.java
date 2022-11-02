package com.reestts.leetcode.easy.problem20;

public class ValidParentheses {

    public static void main(String[] args) {
        System.out.println(isValid("()"));     // true
        System.out.println(isValid("()[]{}")); // true
        System.out.println(isValid("(]"));     // false
        System.out.println(isValid("([)]"));   // false
        System.out.println(isValid("()"));     // true
        System.out.println(isValid("{[]}"));   // true
    }

    static boolean isValid(String s) {
        char[] array = s.toCharArray();
        int firstOpen = 0;
        int firstClose = 0;
        int secondOpen = 0;
        int secondClose = 0;
        int thirdOpen = 0;
        int thirdClose = 0;

        for (char c : array) {
            switch (c) {
                case '(' -> firstOpen++;
                case ')' -> firstClose++;
                case '[' -> secondOpen++;
                case ']' -> secondClose++;
                case '{' -> thirdOpen++;
                case '}' -> thirdClose++;
            }
        }

        return firstOpen == firstClose
                && secondOpen == secondClose
                && thirdOpen == thirdClose
                && s.indexOf(')') - s.indexOf('(') <= 1
                && s.indexOf(']') - s.indexOf('[') <= 1
                && s.indexOf('}') - s.indexOf('{') <= 1
                ;
    }
}
