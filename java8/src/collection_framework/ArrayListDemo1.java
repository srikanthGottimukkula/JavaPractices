package collection_framework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListDemo1 {
    public static void main(String[] args) {
        List<String> al = new ArrayList<String>();
        al.add("srikanth");
        al.add("abhiram");
        al.add("ramu");
        al.add("jhon");
        al.add("varun");

        List<String> al_Dup = new ArrayList<String>();
        al_Dup.addAll(al);
        System.out.println("Duplicate array list: " + al_Dup);
        // al_Dup.removeAll(al);
        System.out.println("Duplicate array list elements : " + al_Dup);

        System.out.println("Before doing sort method() : " + al_Dup);
        // Collections.sort() ----> method
        Collections.sort(al_Dup);
        System.out.println("ascending order : " + al_Dup);

        // descending order ---> method
        Collections.sort(al_Dup, Collections.reverseOrder());
        System.out.println("descending order is : " + al_Dup);

        // shuffle method
        Collections.shuffle(al_Dup);
        System.out.println("shuffle the elements is :" + al_Dup);
    }
}
