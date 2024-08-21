package javaAIT;

import java.util.Arrays;
import java.util.List;

//find the name satrtwith r and length of the word also.
public class StreamDemo4 {

    public static void main(String[] args) {
        List<String> list1 = Arrays.asList("srikanth", "ramu", "raju", "rahim", "rekha");

        list1.stream().filter(name -> name.startsWith("r")).map(name -> name+"-"+name.length()).forEach(name->System.out.println(name));
    }
}
