import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Stream;

//findout Duplicates
public class FindDuplicateNum {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 4, 5, 7, 2, 7, 1, 29, 20, 34, 7, 22, 1);
        Set<Integer> set = new HashSet<>();
        list.stream().filter(s -> set.add(s))
                .forEach(System.out::println);

    }
}
