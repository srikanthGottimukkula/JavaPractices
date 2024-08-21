package collection_framework;

import java.util.Collections;
import java.util.LinkedList;

public class LinkedListDemo1 {
    public static void main(String[] args) {
        LinkedList<String> ll = new LinkedList<String>();
        ll.add("srikanth");
        ll.add("apple");
        ll.add("zebra");
        ll.add("wolf");
        ll.add("jerry");

        LinkedList<String> ll_Dup = new LinkedList<String>();
        ll_Dup.addAll(ll);

        System.out.println(ll_Dup);

        //ascending order
        Collections.sort(ll_Dup);
        System.out.println("Ascending order of elements : " + ll_Dup);

        //descending order
        Collections.sort(ll_Dup, Collections.reverseOrder());
        System.out.println("Descending order of elements : " + ll_Dup);

        //shuffle
        Collections.shuffle(ll_Dup);
        System.out.println("shuffle order is :" + ll_Dup);


    }
}
