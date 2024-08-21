package collection_framework;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class LinkedHashMapDemo {
    public static void main(String[] args) {

        LinkedHashMap<Object, Object> lhm = new LinkedHashMap<Object, Object>();
//        HashMap<Object, Object> lhm = new HashMap<Object, Object>();
        lhm.put(100, "apple");
        lhm.put("banana", 101);
        lhm.put(102, "pienapple");
        lhm.put(103, "orange");
        lhm.put(104, "zebra");

        System.out.println(lhm);
        System.out.println(lhm.keySet());


    }
}
