package practiceStreams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class secondMax {
    public static void main(String[] args) {
        List<Integer> num = Arrays.asList(12, 89, 45, 23);
        Integer i = num.stream().sorted(Comparator.reverseOrder()).skip(1).findFirst().get();
        System.out.println(i);

    }
}
