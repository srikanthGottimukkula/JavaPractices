package streams8Practice;

import java.util.Arrays;

public class SumAndAverage {
    public static void main(String[] args) {
        int a[] = {1, 99, 54, 12, 10};
        int sum = Arrays.stream(a).sum();
        System.out.println(sum);
        double dbl = Arrays.stream(a).average().getAsDouble();
        System.out.println(dbl);
    }
}
