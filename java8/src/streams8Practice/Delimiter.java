package streams8Practice;

import java.util.Arrays;
import java.util.List;
import java.util.StringJoiner;
import java.util.stream.Collectors;

//Given a list of strings, join the strings with ‘[‘ as prefix, ‘]’ as suffix and ‘,’ as delimiter?
public class Delimiter {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("apple", "bat", "moto", "banana");
        String wds = words.stream().collect(Collectors.joining(", ", "[", "]"));
        System.out.println(wds);
    }
}
