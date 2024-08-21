package javaAIT;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class BankPerson {
    int id;
    String name;

    public BankPerson(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "BankPerson{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}

public class StreamDemo1 {

    public static void main(String[] args) {

        //find number greater than 18
        List<Integer> list = Arrays.asList(1, 78, 54, 23, 56, 98, 01);
        list.stream().filter(i -> i > 18).forEach(System.out::println);

        //find the whose name starts with r
        List<String> list1 = Arrays.asList("srikanth", "ram", "raju", "karthik", "john");
        list1.stream().filter(i -> i.startsWith("r")).forEach(System.out::println);

        //find the id >2 and name
        List<BankPerson> list2 = new ArrayList<BankPerson>();
        list2.add(new BankPerson(01, "srikanth"));
        list2.add(new BankPerson(06, "raju"));
        list2.add(new BankPerson(02, "abhiram"));
        list2.add(new BankPerson(9, "sagar"));

        list2.stream().filter(i -> i.id > 2 && i.name.startsWith("s")).forEach(System.out::println);


    }
}
