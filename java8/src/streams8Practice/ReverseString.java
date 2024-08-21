package streams8Practice;

import java.util.Arrays;
import java.util.stream.Collectors;

// Reverse each word of a string using Java 8 streams?
public class ReverseString {
    public static void main(String[] args) {
        String s = "Hey, I am srikanth from warangal!!";

        String s1 = Arrays.stream(s.split(" "))
                .map(word -> new StringBuffer(word).reverse())
                .collect(Collectors.joining(" "));
        System.out.println(s1);


    }
}
