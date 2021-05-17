package com.example.demo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

public class MapIntroTest {
    Map test1;
    Map test2;
    public Map<String, String> mapShare(Map <String, String> map){
        if (map.containsKey("a") && map.containsKey("b")) {
            map.replace("b", map.get("a"));
        }
        map.remove("c");
        return map;
    }

    @Test
    public void testMapShare(){
        test1 = new HashMap(Map.of("a", "aaa", "b", "bbb", "c", "ccc"));
        test2 = new HashMap(Map.of("a", "aaa", "b", "aaa"));
        Assertions.assertEquals(test2, mapShare(test1));
        test1 = new HashMap(Map.of("b", "xyz", "c", "ccc"));
        test2 = new HashMap(Map.of("b","xyz"));
        Assertions.assertEquals(test2, mapShare(test1));
        test1 = new HashMap(Map.of("a", "aaa", "c", "meh", "d", "hi"));
        test2 = new HashMap(Map.of("a", "aaa", "d", "hi"));
        Assertions.assertEquals(test2, mapShare(test1));
    }
}
