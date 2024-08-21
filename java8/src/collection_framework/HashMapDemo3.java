package collection_framework;

import java.util.*;

public class HashMapDemo3 {
    public static void main(String[] args) {

        HashMap<Integer, StudentMap> map = new HashMap<Integer, StudentMap>();

        map.put(1, new StudentMap(1, "srikanth"));
        map.put(10, new StudentMap(6, "raju"));
        map.put(3, new StudentMap(2, "abhiram"));
        map.put(2, new StudentMap(7, "pavan"));
        map.put(12, new StudentMap(8, "shekar"));

        System.out.println(map);
        System.out.println(map.size());

        Set<Integer> ints = map.keySet();
        for (Integer keys : ints) {
            System.out.println(keys + "----" + map.get(keys));
        }
        System.out.println("--------------------------");
        Collection<StudentMap> values = map.values();
        for (StudentMap std : values) {
            System.out.println(std);
        }

        System.out.println("-----------entry set values---------------");
        Set<Map.Entry<Integer, StudentMap>> entries = map.entrySet();
        Iterator<Map.Entry<Integer, StudentMap>> its = entries.iterator();
        while (its.hasNext()) {
            Map.Entry<Integer, StudentMap> nxt = its.next();
            System.out.println(nxt.getKey() + "---->" + nxt.getValue());
        }


    }
}
