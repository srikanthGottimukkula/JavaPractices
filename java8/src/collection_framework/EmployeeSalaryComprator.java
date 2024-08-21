package collection_framework;

import java.util.Comparator;

public class EmployeeSalaryComprator implements Comparator<EmployeeDemo> {

    @Override
    public int compare(EmployeeDemo o1, EmployeeDemo o2) {
//        return (int) (o2.salary-o1.salary);
        return (int) (o1.salary-o2.salary);
    }

}
