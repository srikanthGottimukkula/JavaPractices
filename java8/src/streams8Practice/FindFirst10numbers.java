package streams8Practice;

import java.util.stream.IntStream;

//How do you find sum of first 10 natural numbers?
public class FindFirst10numbers {
    public static void main(String[] args) {

        int sum = IntStream.range(1, 6).sum();
        System.out.println(sum);


    }
}
