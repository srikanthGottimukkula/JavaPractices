package collection_framework;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo1 {
    public static void main(String[] args) {

        HashSet hs = new HashSet();
        hs.add("srikanth");
        hs.add('s');
        hs.add(true);
        hs.add(null);

//        System.out.println(hs);

        //remove()
        hs.remove('s');
        System.out.println(hs);

        //contains()
        System.out.println(hs.contains(true));

        System.out.println(hs.isEmpty()); //false

        System.out.println("------------for each loop--------------");
        for (Object i : hs) {
            System.out.println(i);
        }

        System.out.println("---------Iterator ----------");
        Iterator i = hs.iterator();
        while (i.hasNext()) {
            System.out.println(i.next());
        }

    }
}
