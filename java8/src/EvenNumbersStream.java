import java.util.Arrays;
import java.util.List;
// To print the even numbers using the stream

public class EvenNumbersStream {

    public static void main(String[] args) {

        List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
        nums.stream().filter(s -> (s % 2 == 0)).forEach(System.out::println);
    }
}
