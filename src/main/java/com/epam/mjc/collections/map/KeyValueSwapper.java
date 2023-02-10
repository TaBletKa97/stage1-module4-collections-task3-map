package com.epam.mjc.collections.map;

import java.util.HashMap;
import java.util.Map;

public class KeyValueSwapper {
    public Map<String, Integer> swap(Map<Integer, String> sourceMap) {
        Map<String, Integer> swapMap = new HashMap<>();
        for (Integer i: sourceMap.keySet()) {
            if (swapMap.containsKey(sourceMap.get(i))) {
                if (i < swapMap.get(sourceMap.get(i))) {
                    swapMap.put(sourceMap.get(i), i);
                }
            } else {
                swapMap.put(sourceMap.get(i), i);
            }
        }
        return swapMap;
    }
}
