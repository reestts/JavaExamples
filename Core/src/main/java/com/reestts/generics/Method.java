package com.reestts.generics;

import java.util.List;

public class Method {

    public static <T> T getSecondElement(List<T> list) {
        return list.get(1);
    }
}
