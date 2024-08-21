package practiceStreams;

import java.util.Arrays;
import java.util.List;

public class FindSumAverage {
    public static void main(String[] args) {
        int a[] = {1, 2, 3, 4, 5};
        System.out.println("The average number is :" + Arrays.stream(a).average().getAsDouble());
        System.out.println("the sum of numbers is :" + Arrays.stream(a).sum());

    }
}
