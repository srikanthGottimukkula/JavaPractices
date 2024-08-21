package javaAIT;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

// write a program to find out which employee working in hyd and dept is equals db
class Employee {
    String name;
    String location;
    String dept;

    public Employee(String name, String location, String dept) {
        this.name = name;
        this.location = location;
        this.dept = dept;
    }
}

public class PredicateJoining {

    public static void main(String[] args) {
        Employee e1 = new Employee("srikanth", "hyderabad", "db");
        Employee e2 = new Employee("raju", "bengaluru", "test");
        Employee e3 = new Employee("ramu", "chennai", "prod");
        Employee e4 = new Employee("madhu", "pune", "dev");
        Employee e5 = new Employee("karthik", "delhi", "devops");

        List<Employee> list = Arrays.asList(e1, e2, e3, e4, e5);
        Predicate<Employee> p1 = g -> g.dept.equals("db");
        Predicate<Employee> p2 = g -> g.location.equals("hyderabad");
        Predicate<Employee> p3 = g -> g.name.charAt(0) == 's';
        Predicate<Employee> p4 = g -> g.name.startsWith("s");



        Predicate<Employee> p = p1.and(p2).and(p3).and(p4);

        for (Employee e : list) {
            if (p.test(e)) {
                System.out.println(e.name);
            }

        }


    }
}
