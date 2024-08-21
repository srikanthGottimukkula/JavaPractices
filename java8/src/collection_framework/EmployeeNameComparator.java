package collection_framework;

import java.util.Comparator;

public class EmployeeNameComparator implements Comparator<EmployeeDemo> {


    @Override
    public int compare(EmployeeDemo o1, EmployeeDemo o2) {
        return o1.name.compareTo(o2.name); //ascending order
//        return o2.name.compareTo(o1.name); //desceding orders
    }
}


