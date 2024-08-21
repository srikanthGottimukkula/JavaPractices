package collection_framework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ArrayListStudentDemo {

    public static void main(String[] args) {

        List<StudentDemo> std = new ArrayList<>();
        std.add(new StudentDemo(10,"srikanth",30));
        std.add(new StudentDemo(8,"ramu",23));
        std.add(new StudentDemo(2,"abhiram",36));
        std.add(new StudentDemo(15,"jhon",12));
        std.add(new StudentDemo(12,"scott",0));

//        System.out.println(std);

       //comparable interface implements comparable interface with stddemo class

        Collections.sort(std);


        Iterator<StudentDemo> it = std.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }


    }
}
