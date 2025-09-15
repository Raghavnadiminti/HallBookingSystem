package com.example.demo.models;

import jakarta.persistence.*;

@Entity
@Table(name = "principal")
public class principal {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    public String name;
    public String email;
    private String password;
        public String getpassword(){
        return this.password;
    }

   
}
