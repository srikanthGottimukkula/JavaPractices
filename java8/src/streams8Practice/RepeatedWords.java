package streams8Practice;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

//How do you find the most repeated element in an array?
public class RepeatedWords {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("pen", "banana", "banana", "apple", "pen", "banana");
//        Map<String, Long> repeatedWords = words.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
//        Map.Entry<String, Long> values = repeatedWords.entrySet().stream().max(Map.Entry.comparingByValue()).get();
//        System.out.println("key name is :"+values.getKey());
//        System.out.println("value name is :"+values.getValue());


        Map<String, Long> names = words.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        Map.Entry<String, Long> stringLongEntry = names.entrySet().stream().max(Map.Entry.comparingByValue()).get();
        System.out.println(stringLongEntry.getKey() + " : " + stringLongEntry.getValue());


    }
}
