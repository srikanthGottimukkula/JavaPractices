package streams8Practice;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

//Given a list of integers, find maximum and minimum of those numbers?
public class MaxAndMinNumber {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(12, 23, 28, 99, 0);

        //approach -1
        Integer max = nums.stream().max(Comparator.naturalOrder()).get();
        System.out.println("The max num is :" + max);
        Integer min = nums.stream().min(Comparator.naturalOrder()).get();
        System.out.println("The min value is: " + min);

        System.out.println("-------------------------------------------");
        //approach -2
        Integer maxValue = nums.stream().max(Integer::compareTo).get();
        Integer minValue = nums.stream().min(Integer::compareTo).get();
        System.out.println("The max value is: " + maxValue);
        System.out.println("The min value is: " + minValue);

    }
}
