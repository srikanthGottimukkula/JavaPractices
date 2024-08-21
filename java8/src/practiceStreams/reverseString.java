package practiceStreams;

import java.util.Arrays;
import java.util.stream.Collectors;

public class reverseString {
    public static void main(String[] args) {
        String s = "apple is so tasty";
        String s1 = Arrays.stream(s.split(" "))
                .map(sa -> new StringBuffer(sa).reverse()).collect(Collectors.joining(" "));
        System.out.println(s1);

    }
}
