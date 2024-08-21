package javaAIT;

import java.util.ArrayList;
import java.util.Collections;

public class DesendingOrderLambda {
    public static void main(String[] args) {


        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(10);
        list.add(3);
        list.add(4);

//        Collections.sort(list, (i, j) ->j.compareTo(i));
        Collections.sort(list, (i, j) -> (i > j) ? -1 : 1);
        System.out.println(list);

        System.out.println("++++++++++++++++++++++");
        list.forEach(i-> System.out.print(i));

    }
}

