package practiceStreams;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class AnagaramsOrNOt {
    public static void main(String[] args) {

        String s1 = "listen";
        String s2 = "silent";

        String sd = Stream.of(s1.split("")).map(String::toUpperCase).sorted().collect(Collectors.joining());
        String sf = Stream.of(s2.split("")).map(String::toUpperCase).sorted().collect(Collectors.joining());

        if (sd.equals(sf)) {
            System.out.println("given words are anagrams");
        } else {
            System.out.println("NOt the anagrams!!");
        }

    }
}
