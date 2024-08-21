package collection_framework;

import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetDemo {
    public static void main(String[] args) {
        SortedSet<Integer> ss = new TreeSet();
//        ss.add(10);
//        ss.add(11);
//        ss.add(12);
//        ss.add(13);
//        ss.add(14);

        for (int i = 10; i <= 20; i++) {
            ss.add(i);
        }
        System.out.println(ss.first());
        System.out.println(ss.last());
        System.out.println(ss.headSet(16));
        System.out.println(ss.tailSet(18));
        System.out.println(ss.subSet(13, 15));


    }

}
