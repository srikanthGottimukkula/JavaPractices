package collection_framework;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListDemo {

    public static void main(String[] args) {
        List al = new ArrayList<>();
        al.add("srikanth");
        al.add(20);
        al.add(null);
        al.add("srikanth");
        al.add(true);
        System.out.println(al);  //[srikanth, 20, null, srikanth, true]
        //size()
        System.out.println("size of the arraylist:" + al.size());
        //remove
//        al.remove("srikanth");
        al.remove(3);//[srikanth, 20, null, true]
        System.out.println("After removing the arraylist is: " + al); //[20, null, srikanth]
        //add(index,object);
        al.add(1, "krishna");
        System.out.println("after adding the element is :" + al); //[srikanth, krishna, 20, null, true]
        //get()
        System.out.println("getting specific element is :" + al.get(2));
        //set() add or replace the elements
        System.out.println("replacing the element is:" + al.set(2, "good boy!!"));
        System.out.println("after replacing the element list is : " + al);

        //contains()--> return true or false
        System.out.println(al.contains("srikanth"));
        //isEmpty() --> if al is empty return true, otherwise false
        System.out.println(al.isEmpty());

        //1. for loop
        System.out.println("------------------for loop:-----------------------------");
        for (int i = 0; i < al.size(); i++) {
            System.out.print(" " + al.get(i) + "");
        }
        System.out.println();

        //2. for --each loop
        System.out.println("------------------for Each loop:-----------------------------");
        for (Object j : al) { //---> Object means heterogeneous data type
            System.out.println(j);
        }

        //Iterator
        System.out.println("------------------Iterator method-----------------------------");
        Iterator it = al.iterator();
        while (it.hasNext()) { //---------> return true or false
            System.out.println(it.next());
        }
    }
}
