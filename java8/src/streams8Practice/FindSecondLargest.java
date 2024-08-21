package streams8Practice;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

//Find second largest number in an integer array?
public class FindSecondLargest {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(1, 99, 56, 87, 12, 10);

        Integer i = nums.stream().sorted(Comparator.reverseOrder()).skip(1).findFirst().get();
        System.out.println("The second max value is :" + i);

    }

}
