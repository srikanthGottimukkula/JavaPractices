package streams8Practice;

import java.util.Arrays;
import java.util.List;

// From the given list of integers, print the numbers which are multiples of 2?
public class multiple5 {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(2, 3, 4, 5, 6, 8, 1);
        nums.stream().filter(n->n%2==0).forEach(System.out::println);

    }
}
