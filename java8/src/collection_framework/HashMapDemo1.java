package collection_framework;

import java.util.*;

public class HashMapDemo1 {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(100, "java");
        map.put(101, "python");
        map.put(105, "spring");
        map.put(110, "springboot");
        map.put(121, "corejava");
//        System.out.println(map);

        Set<Integer> keySet = map.keySet();
        for (Integer key : keySet) {
            System.out.println(key + "---" + map.get(key));
        }


//        System.out.println(m1);

        Collection<String> values = map.values();
        for (String value : values) {
            System.out.println(value);
        }

        System.out.println(map.size());
// map.clear();
        System.out.println(map.containsValue("java"));
        System.out.println(map.containsKey(100));


        Set<Map.Entry<Integer, String>> entries = map.entrySet();
        Iterator<Map.Entry<Integer, String>> itr = entries.iterator();
        while (itr.hasNext()) {
            Map.Entry<Integer, String> entry = itr.next();
            System.out.println(entry.getKey() + "----" + entry.getValue());
        }
//entry means one pair

    }
}
