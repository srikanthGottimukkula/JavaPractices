package streams8Practice;

import java.util.stream.IntStream;

//Print first 10 even numbers
public class First10EvenNumbs {
    public static void main(String[] args) {
        IntStream.rangeClosed(1, 10).map(i -> i * 2).forEach(System.out::println);
    }
}
