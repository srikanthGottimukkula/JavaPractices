import java.util.Arrays;
import java.util.List;
//find out number starts with 1
public class NumberStart1 {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 87, 14, 67, 90, 8, 5, 12, 15);
        numbers.stream().map(s -> s + "") //convert Integer to String
                .filter(s -> s.startsWith("1")).forEach(System.out::println);
    }
}
