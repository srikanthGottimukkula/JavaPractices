package collection_framework;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetDemo1 {
    public static void main(String[] args) {
        LinkedHashSet lls = new LinkedHashSet();
        lls.add(100);
        lls.add("srikanth");
        lls.add(true);
        lls.add('c');
        System.out.println(lls);
        System.out.println("---------------------------for loop---------------");
        for (Object i : lls) {
            System.out.println(i);
        }
        System.out.println("-------------iterator loop--------------");
        Iterator iteratorDemo = lls.iterator();
        while (iteratorDemo.hasNext()) {
            System.out.println(iteratorDemo.next());
        }

    }
}
