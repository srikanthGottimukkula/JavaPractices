package javaAIT;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
//parallel stream program
public class StreamDemo12 {
    public static void main(String[] args) {

        System.out.println("************serial streams*****************");
        List<Integer> list1 = Arrays.asList(1, 5, 7, 2, 8, 9, 10);
        list1.forEach(s -> System.out.println(s + "::" + Thread.currentThread().getName()));
        System.out.println("************parallel streams*****************");
        List<Integer> list2 = Arrays.asList(1, 5, 7, 2, 8, 9, 10);
        list2.stream().parallel().forEach(s -> System.out.println(s + "::" + Thread.currentThread().getName()));
    }
}
