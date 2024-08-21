package practiceStreams;

import java.util.Arrays;
import java.util.List;

public class commonElements {
    public static void main(String[] args) {
        List<Integer> num1  = Arrays.asList(1,99,87,56,34);
        List<Integer> num2 = Arrays.asList(1, 98, 187, 156, 34);
        num2.stream().filter(num1::contains).forEach(System.out::println);

    }
}
