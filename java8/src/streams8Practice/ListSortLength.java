package streams8Practice;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

//Given a list of strings, sort them according to increasing order of their length?
public class ListSortLength {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("c", "c++", "java", "python", "cobol");
//        words.stream().map(String::length).forEach(System.out::println);
        words.stream().sorted(Comparator.comparing(String::length)).forEach(System.out::println);
        System.out.println("--------------------------------------");
        words.stream().sorted(Comparator.comparing(String::length).reversed()).forEach(System.out::println);
    }

}
