package javaAIT;

public class Employees {

    int age;
    String name;
    double salary;

    public Employees(int age, String name, double salary) {
        this.age = age;
        this.name = name;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}
