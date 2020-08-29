package com.reestts.generics;

import java.util.ArrayList;

public class Method {
    public static <T> T getSecondElement(ArrayList<T> list) {
        return list.get(1);
    }
}