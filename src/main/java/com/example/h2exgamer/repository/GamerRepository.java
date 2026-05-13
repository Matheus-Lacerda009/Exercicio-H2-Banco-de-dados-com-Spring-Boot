package com.example.h2exgamer.repository;

import com.example.h2exgamer.model.Gamer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GamerRepository extends JpaRepository<Gamer, Long> {
}
