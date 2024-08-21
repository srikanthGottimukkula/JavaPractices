package javaAIT;

import java.util.Optional;

public class Student {

    public Optional<String> getid(Integer id) {
        String name = null;
        if (id == 1) {
            name = "a";
        } else if (id == 2) {
            name = "b";
        } else if (id == 3) {
            name = "c";
        }
           return  Optional.ofNullable(name);
    }
}
