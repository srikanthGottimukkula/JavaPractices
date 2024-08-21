package collection_framework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListDemo3 {
    public static void main(String[] args) {
        List<Integer> al = new ArrayList<Integer>();
        al.add(5);
        al.add(7);
        al.add(1);
        al.add(3);
        al.add(2);

        System.out.println("Before sorting : "+al);
        Collections.sort(al);
        System.out.println("After sorting : "+al);
        Collections.reverse(al);
        System.out.println("reverse sorting : "+al);


    }
}
