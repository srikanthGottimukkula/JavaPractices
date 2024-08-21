package collection_framework;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.add("srikanth");
        ll.add(78);
        ll.add(true);
        ll.add(null);
        ll.add('S');

        System.out.println(ll);  //[srikanth, 78, true, null, S]

        //add()
        ll.add("abhi");
        System.out.println(ll); //[srikanth, 78, true, null, S, abhi]

        //add(index, object)
        ll.add(3, "ram");
        System.out.println(ll);

        //size()
        System.out.println("size of the linked list : " + ll.size());

        //get()
        System.out.println(ll.get(6));

        //set()
        System.out.println(ll.set(2, "sairam"));
        System.out.println(ll); //[srikanth, 78, sairam, ram, null, S, abhi]

        //remove()
        // ll.remove(0);
        System.out.println(ll);  //[srikanth, sairam, ram, null, S, abhi]

        //contains() -->returns true or false
        System.out.println(ll.contains("ram"));  //true
        System.out.println(ll.contains("srikanth")); //false

        //isEmpty()  ---> returns true or false
        System.out.println(ll.isEmpty()); //false

        //1. for loop
        System.out.println("------------------For Loop ------------------------");
        for (int i = 0; i < ll.size(); i++) {
            System.out.println(ll.get(i));
        }

        //2. for each loop
        System.out.println("---------------------For Each Loop-------------------------------");
        for (Object j : ll) {
            System.out.println(j);
        }

        //3. iterator loop
        System.out.println("------------------------Iterator loop-------------------------------");
        Iterator it = ll.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
