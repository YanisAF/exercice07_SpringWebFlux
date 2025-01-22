package org.example.exercice07_springwebflux;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;


@Table("users")
public class User {

    @Id
    private Long id;
    private String name;
    private String email;
    private boolean active;

    public User() {

    }

    public User(String name, String email, boolean active) {
        this.name = name;
        this.email = email;
        this.active = active;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean isOnline() {
        return active;
    }

    public void setOnline(boolean online) {
        active = active;
    }


}
