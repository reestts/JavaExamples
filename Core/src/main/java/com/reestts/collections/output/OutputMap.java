package com.reestts.collections.output;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class OutputMap {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("1", "first");
        map.put("2", "second");
        map.put("3", "third");

        List entryList = new ArrayList(map.entrySet());
        List keyList = new ArrayList(map.keySet());
        List valueList = new ArrayList(map.values());

        System.out.println(entryList);
        System.out.println(keyList);
        System.out.println(valueList);

        // long
//        Iterator<Map.Entry<String, String>> iterator = map.entrySet().iterator();
//        while (iterator.hasNext()) {
//            Map.Entry<String, String> pair = iterator.next();
//            String key = pair.getKey();
//            String value = pair.getValue();
//            System.out.print(key + " : " + value);
//        }

        // short
//        map.forEach((key, value) -> System.out.print(key + " : " + value));
    }
}