package javaAIT;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;


//without lambda
public class DesendingOrder {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.add(20);
        list.add(12);
        list.add(40);
        list.add(1);
        list.add(10);

        Collections.sort(list, new NumberComparator());
        System.out.println("after descending order!!"+list);
    }
}

class NumberComparator implements Comparator<Integer> {


    @Override
    public int compare(Integer i, Integer j) {
        if (i > j) {
            return -1;
        }
        else if (i < j) {
            return 1;
        }
        return 0;
    }
}