package javaAIT;

import java.util.*;
import java.util.stream.Collectors;

class Human {
    int age;
    String name;
    Double salary;

    public Human(int age, String name, Double salary) {
        this.age = age;
        this.name = name;
        this.salary = salary;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Human{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}

//find min,max,avg salary  of given list.
public class StreamsDemo10 {
    public static void main(String[] args) {

        List<Human> list = new ArrayList<>();
        list.add(new Human(10, "srikanth", 10000.00));
        list.add(new Human(23, "krishna", 24000.00));
        list.add(new Human(17, "sairam", 12000.00));
        list.add(new Human(90, "venu", 15000.00));
        list.add(new Human(54, "mahesh", 90000.00));

        //minSalary value
        Optional<Human> minValues = list.stream().collect(Collectors.minBy(Comparator.comparing(Human::getSalary)));
        System.out.println(minValues.get().salary);

        //maxSalary
        Optional<Human> maxvalues = list.stream().collect(Collectors.maxBy(Comparator.comparing(Human::getSalary)));
        System.out.println(maxvalues.get().salary);

        //avgSalary
        Double aDouble = list.stream().collect(Collectors.averagingDouble(emp -> emp.salary));
        System.out.println("averaging salary is::" + aDouble);
    }
}
