package com.example.demo.models;

import jakarta.persistence.*;

@Entity
@Table(name = "clublead")
public class Clublead {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String email;
    private String password;


}
