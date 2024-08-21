package collection_framework;

import java.util.LinkedList;

public class LinkedListDemo2 {
    public static void main(String[] args) {
        LinkedList<String> ll = new LinkedList<>();
        ll.add("dog");
        ll.add("cat");
        ll.add("rat");
        ll.add("lion");

        System.out.println(ll);

        ll.addFirst("elephant");

        System.out.println(ll);

        ll.addLast("tiger");
        System.out.println(ll);

        System.out.println(ll.getFirst());
        System.out.println(ll.getLast());


    }
}
