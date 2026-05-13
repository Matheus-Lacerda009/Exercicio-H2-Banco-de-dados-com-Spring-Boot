package com.example.h2exgamer.model;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Gamer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String nickname, email, jogoFavorito, nivel;
}
