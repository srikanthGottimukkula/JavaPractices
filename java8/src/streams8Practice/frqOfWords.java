package streams8Practice;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

//How do you find frequency of each element in an array or a list?
public class frqOfWords {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("srikanth", "apple", "books", "god", "srikanth", "moto", "apple");
        Map<String, Long> collect = names.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(collect);
    }
    //Function.identity() --> always returns the input value.
}
