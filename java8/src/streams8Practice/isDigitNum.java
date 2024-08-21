package streams8Practice;

import java.util.Arrays;
import java.util.List;

//Given a list of strings, find out those strings which start with a number?
public class isDigitNum {
    public static void main(String[] args) {
        List<String> numbers = Arrays.asList("1one", "two", "3three", "zero");
        numbers.stream().filter(str -> Character.isDigit(str.charAt(0))).forEach(System.out::println);
    }
}
