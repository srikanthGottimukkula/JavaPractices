package javaAIT;

import java.util.function.BiFunction;
import java.util.function.Function;

public class FunctionDemo {
    public static void main(String[] args) {
        Function<String, Integer> f = (name) -> name.length();
        System.out.println(f.apply("srikanth"));
        System.out.println(f.apply("Ramu"));
        System.out.println(f.apply("Abhiram"));

        System.out.println("*****************************");
        BiFunction<Integer,Integer,Integer> bif = (i, j)-> (i+j);
        System.out.println(bif.apply(10,20));

    }
}
