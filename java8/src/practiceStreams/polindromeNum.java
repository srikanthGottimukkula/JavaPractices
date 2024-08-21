package practiceStreams;

import java.util.stream.IntStream;

public class polindromeNum {
    public static void main(String[] args) {
        String str = "madam";
        boolean pol = IntStream.rangeClosed(1, str.length()/2)
                .noneMatch(i -> str.charAt(i) != str.charAt(str.length() - i - 1));

        if(pol){
            System.out.println("yes");
        }else {
            System.out.println("no");
        }
    }
}
