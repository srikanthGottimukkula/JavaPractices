package javaAIT;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

//take a list of persons whose age is greater than 18 or not
public class PredicateDemo3 {

    public static void main(String[] args) {

        List<Person> list = new ArrayList<Person>();
        list.add(new Person(18, "srikanth"));
        list.add(new Person(19, "ramesh"));
        list.add(new Person(20, "Krthik"));
        list.add(new Person(45, "raju"));

        Predicate<Person> p1 = age -> age.age >= 18;
        for (Person p : list) {
            if (p1.test(p)) {
                System.out.println(p.name);
            }
        }


    }
}
