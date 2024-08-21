package javaAIT;

import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class PrediacteDemo2 {


    public static void main(String[] args) {
        Predicate<Integer> p = i -> i > 10;
        System.out.println(p.test(11));

        BiPredicate<Integer, Integer> bp = (i, j) -> (i + j) >= 10;
        System.out.println(bp.test(2, 5));
    }
}
