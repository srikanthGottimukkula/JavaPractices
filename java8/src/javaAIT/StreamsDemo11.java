package javaAIT;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
//grouping by in streams

class UserDetails {
    String name;
    Double salary;
    String country;

    public UserDetails(String name, Double salary, String country) {
        this.name = name;
        this.salary = salary;
        this.country = country;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public String getCountry() {
        return country;
    }

    @Override
    public String toString() {
        return "userDetails{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                ", country='" + country + '\'' +
                '}';
    }
}


public class StreamsDemo11 {
    public static void main(String[] args) {
        List<UserDetails> list = new ArrayList<>();
        list.add(new UserDetails("ram", 10000.00, "india"));
        list.add(new UserDetails("raju", 50000.00, "usa"));
        list.add(new UserDetails("ram", 13000.00, "uk"));
        list.add(new UserDetails("ram", 11000.00, "japan"));

        Map<String, List<UserDetails>> users = list.stream().collect(Collectors.groupingBy(ud -> ud.country));

        System.out.println(users);
    }
}
