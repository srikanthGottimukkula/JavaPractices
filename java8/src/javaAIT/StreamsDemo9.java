package javaAIT;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

class Employees1 {
    int age;
    String name;
    String country;

    public Employees1(int age, String name, String country) {
        this.age = age;
        this.name = name;
        this.country = country;
    }

    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", country='" + country + '\'' +
                '}';
    }
}

//Finding operation in streams
public class StreamsDemo9 {
    public static void main(String[] args) {

        List<Employees1> list = new ArrayList<>();

        list.add(new Employees1(18, "ramu", "usa"));
        list.add(new Employees1(15, "raju", "china"));
        list.add(new Employees1(28, "karthik", "japan"));
        list.add(new Employees1(30, "krishna", "india"));
        list.add(new Employees1(31, "raju", "india"));
        list.add(new Employees1(25, "srikanth", "india"));

        //Optional[Person{age=25, name='srikanth', country='india'}] if use finding operation in streams
        //findFirst
        Optional<Employees1> firstFind = list.stream().filter(c -> c.country.equals("india")).findFirst();
        if (firstFind.isPresent()) {
            System.out.println(firstFind.get());
        } else {
            System.out.println("invalid data!!");
        }

        //findAny()
//        Optional<Employees1> findAnyValues = list.stream().filter(c -> c.country.equals("india")).findAny();
//
//        if (findAnyValues.isPresent()) {
//            System.out.println(findAnyValues.get());
//        }

        //by using collect method we can print the employees names on the console.
//        List<String> india = list.stream().filter(c -> c.country.equals("india")).map(c -> c.name).collect(Collectors.toList());
//        System.out.println(india);
    }
}
