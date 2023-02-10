package com.epam.mjc.collections.map;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class WordRepetitionMapCreator {
    public Map<String, Integer> createWordRepetitionMap(String sentence) {
        Map<String, Integer> map = new HashMap<>();
        Arrays.stream(sentence.split("\\W"))
                .filter(e -> !e.isEmpty())
                .map(String::toLowerCase)
                .forEach(e -> {
                    if (map.containsKey(e)) {
                        map.put(e, map.get(e) + 1);
                    } else {
                        map.put(e, 1);
                    }
                });
        return map;
    }
}


