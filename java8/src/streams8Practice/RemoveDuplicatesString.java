package streams8Practice;

import java.util.Arrays;
import java.util.List;

//How do you remove duplicate elements from a list using Java 8 streams?
public class RemoveDuplicatesString {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("srikanth", "ram", "karthik", "shekar", "srikanth", "ram");
        names.stream().distinct().forEach(System.out::println);
    }
}
