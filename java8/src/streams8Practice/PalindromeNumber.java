package streams8Practice;

import java.util.stream.IntStream;

// Palindrome program using Java 8 streams
public class PalindromeNumber {

    public static void main(String[] args) {
        String str = "ROTATOR";
        boolean isPolindrome = IntStream.rangeClosed(0, str.length() / 2)
                .noneMatch(i -> str.charAt(i) != str.charAt(str.length() - i - 1));

        if (isPolindrome) {
            System.out.println("yes polinedrome !!");
        } else {
            System.out.println("not polidrome !!");
        }

    }
}
