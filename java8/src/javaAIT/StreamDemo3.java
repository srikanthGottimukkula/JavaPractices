package javaAIT;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;
//TO find the length of the given words.
public class StreamDemo3 {
    public static void main(String[] args) {
//        Stream<String> names = Stream.of("us","uk","india","china");
        List<String> list1 = Arrays.asList("us", "uk", "india", "china");

        list1.stream().mapToInt(name -> name.length()).forEach(System.out::println);
    }
}
