package com.example.demo.models;

import jakarta.persistence.*;

@Entity
@Table(name = "halls")
public class Halls {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String hallName;


}
