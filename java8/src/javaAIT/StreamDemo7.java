package javaAIT;

import java.util.Arrays;
import java.util.List;

//skip(), limit() and distinct() are return new streams these are intermediate operation methods in streams.
public class StreamDemo7 {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("srikanth", "raju", "abhiram", "madhu");
//       names.stream().limit(2).forEach(System.out::println);
//       names.stream().skip(2).forEach(System.out::println);
        List<String> name = Arrays.asList("srikanth", "raju", "abhiram", "madhu", "srikanth", "raju");
        name.stream().distinct().forEach(System.out::println);


    }
}
