package streams8Practice;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

//How do you sort the given list of decimals in reverse order?
public class decimalReverseOrder {
    public static void main(String[] args) {
        List<Double> decimal = Arrays.asList(12.2, 25.34, 56.67, 66.7, 89.3, 99.0);
        decimal.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
    }
}
