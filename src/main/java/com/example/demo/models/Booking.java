package com.example.demo.models;

import java.time.*;
import java.util.*;
import jakarta.persistence.*;

@Entity
@Table(name = "bookings")
public class Booking {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Date booking_date;
    private DayOfWeek day;
    private int slotno;

    @OneToOne
    @JoinColumn(name = "request_id")
    private Request request;

 
}
