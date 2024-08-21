package javaAIT;

import java.util.function.Predicate;
//Find First Character of String name start with 's'
public class PredicateDemo1 {

    public static void main(String[] args) {


        String[] names = {"Srikanth", "Sriram", "Siddhu", "Apple", "Naveen"};

        Predicate<String> p = name -> name.charAt(0) == 'S';
        for (String name : names) {
            if (p.test(name)) {
                System.out.println(name);
            }
        }
    }
}
