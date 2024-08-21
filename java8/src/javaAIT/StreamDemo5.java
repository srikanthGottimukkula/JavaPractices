package javaAIT;

import java.util.ArrayList;
import java.util.List;

//print whose name and age whose salary greater than 20000
public class StreamDemo5 {

    public static void main(String[] args) {

        List<Employees> emp = new ArrayList<Employees>();
        emp.add(new Employees(18, "srikanth", 12.500));
        emp.add(new Employees(24, "raju", 15.500));
        emp.add(new Employees(32, "shyam", 2.500));
        emp.add(new Employees(56, "niharika", 52.500));
        emp.add(new Employees(21, "chandu", 32.500));
        emp.add(new Employees(15, "abhiram", 22.500));

        emp.stream().filter(em -> em.salary > 20.000).map(em -> em.name + "-" + em.age).forEach(System.out::println);


    }
}
