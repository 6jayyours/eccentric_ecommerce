package com.example.eccentricclothing.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class Wallet {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne
    @JoinColumn(name="user_id")
    private User user;

    private double amount=0.0;

}
