package javaAIT;

import java.util.Optional;

public class User {

    public Optional<String> getUsernameById(Integer id) {
        String name = null;
        if (id == 100) {
            name = "srikanth";
        } else if (id == 101) {
            name = "abhiram";
        } else if (id == 102) {
            name = "raju";
        }
        return Optional.ofNullable(name);
    }

}
