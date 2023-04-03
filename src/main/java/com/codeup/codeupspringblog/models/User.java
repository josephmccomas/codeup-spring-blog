package com.codeup.codeupspringblog.models;

import jakarta.persistence.Entity;
import org.hibernate.annotations.Table;

public class User {
    @Entity
    @Table(name = "users")
    public class User {
        /* ... */

        public User(User copy) {
            id = copy.id; // This line is SUPER important! Many things won't work if it's absent
            email = copy.email;
            username = copy.username;
            password = copy.password;
        }
    }

}
