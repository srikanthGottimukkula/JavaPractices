package javaAIT;

import java.util.Arrays;
import java.util.List;

public class StreamsDemo6 {
 //flatmap used to nestedlists
    //map transform the data
    public static void main(String[] args) {
        List<String> fruits = Arrays.asList("Apple", "mangos", "bananas", "pienapple");
        List<String> vegetables = Arrays.asList("lemon", "ladiesFinger", "potato", "tomato");

        List<List<String>> lists = Arrays.asList(fruits, vegetables);
        lists.stream().flatMap(list -> list.stream()).forEach(System.out::println);


    }
}
