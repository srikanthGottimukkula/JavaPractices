package collection_framework;

import java.util.*;

public class HashMapDemo {
    public static void main(String[] args) {
        HashMap<Object, Object> map = new HashMap<Object, Object>();
//        LinkedHashMap<Object, Object> map = new LinkedHashMap<Object, Object>();

        map.put(100, "java"); //insertion order is not maintained
        map.put("java", 101); //Heterogeneous keys and Heterogeneous values are allowed
        map.put(null, null); // null keys & null values are allowed
        map.put(103, "html"); //Duplicate values are allowed
        map.put(104, "css"); //It is available from java 1.2v
        map.put(105, "spring"); //Its default capacity is 16, Load factor is 0.75
        map.put(105, "python"); //Its size increase by double
        System.out.println(map); //its not synchronized

        System.out.println("---------------------------");
        System.out.println(map.get(100));
        System.out.println(map.get("java"));
        System.out.println("--------------------");

//        LinkedHashSet<Object> hs1 = new LinkedHashSet<Object>(map.keySet());
        LinkedHashSet<Object> hs1 = new LinkedHashSet<Object>(map.keySet());
        System.out.println("keys present in the set : " + hs1);
        Iterator<Object> it = hs1.iterator();
        while (it.hasNext()) {
            System.out.print(it.next() + " ");
        }
        System.out.println();
        System.out.println("-------------------------------");
        HashSet<Object> hs2 = new HashSet<Object>(map.entrySet());
        Iterator<Object> its = hs2.iterator();
        while (its.hasNext()) {
//            System.out.println(its.next());
            Map.Entry e = (Map.Entry) its.next();
            System.out.println(e.getKey() + " " + e.getValue());
        }
    }
}
