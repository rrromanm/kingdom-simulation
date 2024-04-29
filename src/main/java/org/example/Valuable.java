package org.example;

import java.util.HashMap;
import java.util.Map;

public class Valuable
{
    private String type;
    private Valuable(String type){
        this.type = type;
    }
    private static Map<String, Valuable> instances = new HashMap<>();

    public static Valuable getInstance(String type){
        if (!instances.containsKey(type)) {
            instances.put(type, new Valuable(type));
        }
        return instances.get(type);
    }

    public String getType() {
        return type;
    }
}
