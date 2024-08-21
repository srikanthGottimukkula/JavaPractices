package streams8Practice;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

//Java 8 program to check if two strings are anagrams or not
public class anagramsOrNot {
    public static void main(String[] args) {
        String s1 = "raceCar";
//        String s2 = "CarRace";
        String s2 = "srikanth";

        String sd = Stream.of(s1.split("")).map(String::toUpperCase).sorted().collect(Collectors.joining());
        String sf = Stream.of(s2.split("")).map(String::toUpperCase).sorted().collect(Collectors.joining());
        if (sd.equals(sf)) {
            System.out.println("this Strings are anagrams");
        } else {
            System.out.println("not!!");
        }
    }
}
