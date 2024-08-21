package practiceStreams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class StringValueLength {
    public static void main(String[] args) {
        List<String> word = Arrays.asList("sri", "apple", "ganesh", "school");
        word.stream().sorted(Comparator.comparing(String::length)).forEach(System.out::println);

    }
}
