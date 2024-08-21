package collection_framework;

import java.util.*;

//comparator interface is better compare to comparable.
//multiple sorting without distubing class
public class ArrayListEmployeeDemo {
    public static void main(String[] args) {
        List<EmployeeDemo> emp = new ArrayList<>();
        emp.add(new EmployeeDemo(1, "srikanth", 12000.00));
        emp.add(new EmployeeDemo(56, "abhiram", 1000.00));
        emp.add(new EmployeeDemo(34, "teja", 13000.00));
        emp.add(new EmployeeDemo(12, "vamshi", 65000.00));
        emp.add(new EmployeeDemo(90, "balaraju", 70000.00));
        emp.add(new EmployeeDemo(54, "elon", 15000.00));

//        Collections.sort(emp, new EmployeeIDComprator());
//        Collections.sort(emp, new EmployeeNameComparator());
//        Collections.sort(emp, new EmployeeSalaryComprator());

        Collections.sort(emp, new Comparator<EmployeeDemo>() {
            @Override
            public int compare(EmployeeDemo o1, EmployeeDemo o2) {
                if (o1.id > o2.id) {
                    return 1; //ascending order
                } else if (o1.id < o2.id) {
                    return -1;  //descending order
                } else {
                    return 0;  //neutral
                }
            }
        });

        Iterator<EmployeeDemo> it = emp.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

    }
}
