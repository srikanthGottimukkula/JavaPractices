package streams8Practice;

import java.util.Map;
import java.util.Scanner;
import java.util.function.Function;
import java.util.stream.Collectors;

public class freqOfCharacter {
    public static void main(String[] args) {
//        String name ="Hey, Hi my name is srikanth !!";
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string value ");
        String words = sc.nextLine();

        Map<Character, Long> frqString = words.chars() // Convert the String to an IntStream
                .mapToObj(c -> (char) c) //Convert each intStream to a char
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(frqString);
    }
}
