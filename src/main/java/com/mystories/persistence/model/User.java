package com.mystories.persistence.model;

import org.springframework.security.crypto.bcrypt.BCrypt;

import javax.persistence.*;

//Auto-configuration is always applied after user-defined beans have been registered.
//@EnableAutoConfiguration(excludeName = {"multipartResolver","mbeanServer"})
@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false, unique = true)
    private String password;

    //TODO check if it is OK fot JPA
    public User(String name, String password) {
        this.name = name;
        this.password = BCrypt.hashpw(password, BCrypt.gensalt());
    }

}
