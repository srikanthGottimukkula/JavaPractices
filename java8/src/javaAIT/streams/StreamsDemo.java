package javaAIT.streams;

import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamsDemo {

    public static void main(String[] args) {

        List<Employees> emps = new ArrayList<>();
        emps.add(new Employees(1, "jhansi", 32, "female", "hr", 2011, 25000.00));
        emps.add(new Employees(2, "smith", 25, "male", "sales", 2015, 13500.00));
        emps.add(new Employees(3, "david", 29, "male", "infrastructure", 2012, 18000.00));
        emps.add(new Employees(4, "orlen", 28, "male", "developement", 2014, 32500.00));
        emps.add(new Employees(5, "charles", 27, "male", "hr", 2013, 22700.00));

        emps.add(new Employees(6, "cathy", 43, "male", "security", 2016, 10500.00));
        emps.add(new Employees(7, "ramesh", 35, "male", "finance", 2010, 27000.00));
        emps.add(new Employees(8, "suresh", 31, "male", "development", 2015, 34500.00));
        emps.add(new Employees(9, "gita", 24, "female", "sales", 2016, 11500.00));
        emps.add(new Employees(10, "gouri", 27, "female", "infrastructure", 2014, 15700.00));
        emps.add(new Employees(11, "nithin", 25, "male", "development", 2016, 25000.00));
        emps.add(new Employees(12, "swathi", 27, "female", "finance", 2013, 21300.00));
        emps.add(new Employees(13, "buttler", 24, "male", "sales", 2017, 10700.00));
        emps.add(new Employees(14, "ashok", 23, "male", "infrastructure", 2018, 12700.00));
        emps.add(new Employees(15, "sanvi", 26, "female", "development", 2015, 28900.00));

        //1.How many males and females employees are there in the organization

//        Map<String, Long> mfNumbs = emps.stream().collect(Collectors.groupingBy(emp -> emp.getGender(), Collectors.counting()));
//        System.out.println(mfNumbs);

        // 2. print the name of all departments in the organization
//        emps.stream().map(e->e.getDepartment()).distinct().forEach(System.out::println);

        // 3. what is the average age of male and female employees
//        Map<String, Double> avgMF = emps.stream().collect(Collectors.groupingBy(Employees::getGender, Collectors.averagingInt(Employees::getAge)));
//        System.out.println(avgMF);

        //4.Get the details of higest paid employees in the organization
//        Optional<Employees> higestSal = emps.stream().collect(Collectors.maxBy(Comparator.comparingDouble(Employees::getSalary)));
//        if (higestSal.isPresent()) {
//            System.out.println(higestSal.get());
//        }

        //5.get the names of all the employees who are joined after 2015
//        emps.stream().filter(emp->emp.yearOfJoining>2015).map(n->n.name).forEach(System.out::println);

        //6. count the number of employees in each department
//        Map<String, Long> depEmpl = emps.stream().collect(Collectors.groupingBy(Employees::getDepartment, Collectors.counting()));
//        System.out.println("Total no.of employees in each dept is:" + depEmpl);

//        //7. what is the average saalry of each department
//        Map<String, Double> eachDeptAvag = emps.stream().collect(Collectors.groupingBy(Employees::getDepartment, Collectors.averagingDouble(Employees::getSalary)));
//        System.out.println("Each department avg salary is::" + eachDeptAvag);

        //8.get the details of youngest male employee in the development department
//        Optional<Employees> min = emps.stream().filter(e -> e.getGender().equals("male") && e.getDepartment().equals("development"))
//                .min(Comparator.comparing(Employees::getAge));
//        if (min.isPresent()) {
//            System.out.println(min.get());
//        }

        //9. who has the most working experience in the organization
//        Optional<Employees> yofJoining = emps.stream().collect(Collectors.minBy(Comparator.comparing(Employees::getYearOfJoining)));
//        if (yofJoining.isPresent()) {
//            System.out.println(yofJoining.get());
//        }

        //10.how may male and female employees are there in sales department
//        Map<String, Long> sales = emps.stream().filter(e -> e.getDepartment().equals("sales"))
//                .collect(Collectors.groupingBy(Employees::getGender, Collectors.counting()));
//        System.out.println(sales);

        //11. what is the average salary of male and female employees
//        Map<String, Double> avgSal = emps.stream().collect(Collectors.groupingBy(Employees::getGender, Collectors.averagingDouble(Employees::getSalary)));
//        System.out.println(avgSal);

        //12.list down the names of all employees in each department
//        emps.stream().forEach(e-> System.out.println(e.name+"-"+e.department));

        //13.what is the average salary and total salary of the whole organization
//        Double v1 = emps.stream().collect(Collectors.averagingDouble(Employees::getSalary));
//        System.out.println(v1);
//        double v = emps.stream().mapToDouble(Employees::getSalary).sum();
//        System.out.println(v);

        //14.who is the oldest employee in the organization ? what is his age and which department he belongs to
        Optional<Employees> oldestAge = emps.stream().collect(Collectors.maxBy(Comparator.comparing(Employees::getAge)));
        if (oldestAge.isPresent()) {
            System.out.println(oldestAge.get());
        }

    }
}
