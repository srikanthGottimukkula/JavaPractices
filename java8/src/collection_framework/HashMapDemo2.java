package collection_framework;

import java.util.*;

public class HashMapDemo2 {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<Integer, String>();
        map.put(100, "apple");
        map.put(110, "banana");
        map.put(108, "mango");
        map.put(101, "pienapple");

        System.out.println(map.size());
        System.out.println(map.containsKey(100));
        System.out.println(map.containsValue("mango"));

        Set<Integer> key = map.keySet();
        for (Integer keys : key) {
            System.out.println(keys + "------" + map.get(keys));
        }

        Collection<String> values = map.values();
        for (String value : values) {
            System.out.println(value);
        }

        Set<Map.Entry<Integer, String>> entries = map.entrySet();
        Iterator<Map.Entry<Integer, String>> it = entries.iterator();
        while (it.hasNext()) {
            Map.Entry<Integer, String> its = it.next();
            System.out.println(its.getKey() + "----" + its.getValue());
        }

    }
}
