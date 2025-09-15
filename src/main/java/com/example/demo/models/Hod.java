package com.example.demo.models;

import jakarta.persistence.*;

@Entity
@Table(name = "hod")
public class Hod {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String email;
    private String password;

}
