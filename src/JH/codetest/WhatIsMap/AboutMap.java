package JH.codetest.WhatIsMap;

import java.util.HashMap;
import java.util.Map;

public class AboutMap {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("One", 1);
        map.put("two", 2);
        map.put("three", 3);
        System.out.println(map);
    }
}
