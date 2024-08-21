package streams8Practice;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Max3And3Min {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(99, 98, 97, 23, 12, 1, 0);
        System.out.println("Three Min numbers are ");
        numbers.stream().sorted().limit(3).forEach(System.out::println);
        System.out.println("Three max Values");
        numbers.stream().sorted(Comparator.reverseOrder()).limit(3).forEach(System.out::println);
    }
}
