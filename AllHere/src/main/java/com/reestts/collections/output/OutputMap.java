package com.reestts.collections.output;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class OutputMap {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<String, String>();
        map.put("1", "first");
        map.put("2", "second");
        map.put("3", "third");

        // long
        Iterator<Map.Entry<String, String>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, String> pair = iterator.next();
            String key = pair.getKey();
            String value = pair.getValue();
            System.out.print(key + " : " + value);
        }

        // short
        map.forEach((key, value) -> System.out.print(key + " : " + value));
    }
}