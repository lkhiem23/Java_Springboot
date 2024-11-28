package com.devmaster.lesson1.CollectionAPI_Enhencements;

import java.util.HashMap;
import java.util.Map;

public class ForEachMapExample {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "Java Spring");
        map.put(2, "C#");
        map.put(3, "PHP");
        map.put(4, "Python");
        map.put(5, "NetCore");

        // HIỂN THỊ DỮ LIỆU
        map.forEach((key, value) -> System.out.println(key + ": " + value));
    }
}
