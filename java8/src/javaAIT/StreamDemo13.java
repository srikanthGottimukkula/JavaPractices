package javaAIT;

import java.util.Arrays;
import java.util.List;
import java.util.Spliterator;

public class StreamDemo13 {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("srikanth", "raju", "ramu", "shiva");

        //getting spliterator
        Spliterator<String> spliterator1 = names.spliterator();
        spliterator1.forEachRemaining(System.out::println);


    }
}
