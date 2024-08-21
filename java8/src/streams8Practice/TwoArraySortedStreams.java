package streams8Practice;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.stream.IntStream;

// How do you merge two unsorted arrays into single sorted array using Java 8 streams?
public class TwoArraySortedStreams {
    public static void main(String[] args) {
        int a[] = {2, 5, 1, 9, 3};
        int b[] = {1, 4, 6, 7};

        int[] c = IntStream.concat(Arrays.stream(a), Arrays.stream(b)).sorted().distinct().toArray();
        System.out.println(Arrays.toString(c));


    }
}
