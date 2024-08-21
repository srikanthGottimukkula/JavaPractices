package javaAIT;

import java.util.Optional;
import java.util.Scanner;

public class OptionalDemo1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the id:");
        int userId = sc.nextInt();
        Student std = new Student();
        Optional<String> getid = std.getid(userId);
        if (getid.isPresent()) {
            String name = getid.get();
            System.out.println(name.toUpperCase() + " Hello :");
        } else {
            System.out.println("Invalid data!!");
        }
    }
}
