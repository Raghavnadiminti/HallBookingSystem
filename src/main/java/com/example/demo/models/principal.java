package com.example.demo.models;

import jakarta.persistence.*;

@Entity
@Table(name = "principal")
public class principal {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String email;
    private String password;

   
}
