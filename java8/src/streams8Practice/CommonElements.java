package streams8Practice;

import java.util.Arrays;
import java.util.List;

//How do you find common elements between two arrays?
public class CommonElements {
    public static void main(String[] args) {

        List<Integer> num1 = Arrays.asList(1, 2, 34, 54, 99);
        List<Integer> num2 = Arrays.asList(01, 2, 34, 54, 98);
        num1.stream().filter(num2::contains).forEach(System.out::println);


    }
}
