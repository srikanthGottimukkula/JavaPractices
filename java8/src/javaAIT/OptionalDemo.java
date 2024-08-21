package javaAIT;

import java.util.Optional;
import java.util.Scanner;

public class OptionalDemo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the your id");
        int userId = sc.nextInt();

        User u = new User();
        Optional<String> username = u.getUsernameById(userId);
        if (username.isPresent()) {
            String name = username.get();
            System.out.println(name.toUpperCase() + " : Hello, Good Morning!!");
        } else {
            System.out.println("oops, no data found!!");
        }
    }
}
