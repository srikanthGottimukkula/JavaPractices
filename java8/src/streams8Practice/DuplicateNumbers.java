package streams8Practice;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class DuplicateNumbers {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(11, 22, 11, 10, 5, 12, 1);
        HashSet<Object> uniqueElemnets = new HashSet<>();
        Set<Integer> duplicate = nums.stream().filter(i -> !uniqueElemnets.add(i)).collect(Collectors.toSet());
        System.out.println(duplicate);
    }
}
