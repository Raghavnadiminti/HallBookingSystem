package com.example.demo.models;

import jakarta.persistence.*;

@Entity
@Table(name = "request")
public class Request {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    @JoinColumn(name = "clublead_id")
    private Clublead requester;

    private String status;
    private String letter;

    // getters and setters
}
