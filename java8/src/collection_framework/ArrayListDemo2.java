package collection_framework;

import java.util.Arrays;
import java.util.List;
//converting from arrays to arraylist
public class ArrayListDemo2 {
    public static void main(String[] args) {
        String arr[] = {"dog", "fox", "lion", "tiger"};
        for (String ar : arr) {
            System.out.println(ar);
        }
        List obj = Arrays.asList(arr);
        System.out.println("this is list format data: " + obj);
    }
}
