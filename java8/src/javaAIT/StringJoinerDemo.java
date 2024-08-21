package javaAIT;

import java.util.StringJoiner;

public class StringJoinerDemo {

    public static void main(String[] args) {
        StringJoiner sj1 = new StringJoiner("-");
        sj1.add("Srikanth");
        sj1.add("is");
        sj1.add("Good");
        sj1.add("person");
        System.out.println(sj1);

        StringJoiner sj2 = new StringJoiner("-", "[", "]");
        sj2.add("Srikanth");
        sj2.add("is");
        sj2.add("Good");
        sj2.add("person");
        System.out.println(sj2);
    }
}
