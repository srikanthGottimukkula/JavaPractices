package collection_framework;

import java.util.HashSet;

public class HashSetDemo2 {
    public static void main(String[] args) {
        HashSet hs = new HashSet();
        hs.add("srikanth");
        hs.add("name");
        hs.add("jhon");
        hs.add("siri");

        //addAll()
        System.out.println(hs);
        HashSet hs1 = new HashSet();
        hs1.addAll(hs);
        System.out.println("All the hashsset elements : " + hs1);

        //removeAll();
        System.out.println("remove all method : " + hs1.removeAll(hs));
        System.out.println(hs1);
    }
}
