package BasicsPrgms;

import java.util.Arrays;

public class anagram {
    public static void main(String[] args) {
        String s1 ="race";
        String s2="care";

        if(s1.length()!=s2.length()){
            System.out.println("given strings length not anagrams");
            return;
        }

        char[] c1 = s1.toCharArray();//converts String to char
        char[] c2 = s2.toCharArray(); //converts string to char

        Arrays.sort(c1);
        Arrays.sort(c2);

        boolean flag = Arrays.equals(c1, c2);
        if(flag){
            System.out.println("Given Strings are anagrams");
        }else {
            System.out.println("not anagrams");
        }

    }
}
