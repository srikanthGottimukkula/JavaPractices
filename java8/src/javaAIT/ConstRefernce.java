package javaAIT;

import java.util.function.Supplier;

class School {
    public School() {
        System.out.println("School is started!!");
    }
}

public class ConstRefernce {
    public static void main(String[] args) {
        Supplier<School> s = School::new;
    }
}
