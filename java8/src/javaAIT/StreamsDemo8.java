package javaAIT;

import java.util.ArrayList;
import java.util.List;

class Persons {
    int age;
    String name;
    String country;

    public Persons(int age, String name, String country) {
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

public class StreamsDemo8 {
    //matching slice in streams terminal operations.
    public static void main(String[] args) {

        List<Persons> list = new ArrayList<>();
        list.add(new Persons(25, "srikanth", "india"));
        list.add(new Persons(18, "ramu", "usa"));
        list.add(new Persons(15, "raju", "china"));
        list.add(new Persons(28, "karthik", "japan"));
        list.add(new Persons(30, "krishna", "india"));

        //anyMatch
//        boolean indians = list.stream().anyMatch(c -> c.country.equals("india"));
//        System.out.println("Is Indians available in the collection or not?: "+indians);
        //allMatch
//        boolean allMatchIndians = list.stream().allMatch(c -> c.country.equals("india"));
//        System.out.println("is all are indians are not:: "+allMatchIndians);

        //noneMatch
        boolean ukAvailble = list.stream().noneMatch(c -> c.country.equals("uk"));
        System.out.println("is Uk Availble or not ::" + ukAvailble);


    }
}
