package javaAIT;

import java.util.Arrays;
import java.util.List;
// To print the array of elements into upper case.
public class StreamDemo2 {

    public static void main(String[] args) {
        List<String> list1 = Arrays.asList("us", "uk", "china", "india");

        list1.stream().map(i -> i.toUpperCase()).forEach(System.out::println);
    }
}
