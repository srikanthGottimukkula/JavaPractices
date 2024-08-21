package streams8Practice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;
//Given a list of integers, separate odd and even numbers?
public class EvenAndOdd {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(1, 99, 56, 34, 23, 12, 10);
        List<Integer> even = nums.stream().filter(i -> i % 2 == 0).collect(Collectors.toList());
        List<Integer> odd = nums.stream().filter(i -> i % 2 != 0).collect(Collectors.toList());

        System.out.println("even values are :" + even);
        System.out.println("odd values are :" + odd);
    }
}
