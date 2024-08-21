package collection_framework;

import java.util.Comparator;

public class EmployeeIDComprator implements Comparator<EmployeeDemo> {


    @Override
    public int compare(EmployeeDemo e1, EmployeeDemo e2) {
        return e2.id-e1.id; //descending order
        //return e1.id-e2.id //ascending order
    }
}
