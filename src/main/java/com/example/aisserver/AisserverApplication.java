package com.example.aisserver;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

@SpringBootApplication
public class AisserverApplication implements CommandLineRunner {
    @Autowired
    private AisRepository aisRepository;

    public static void main(String[] args) {
        SpringApplication.run(AisserverApplication.class, args);
    }

    @Override
    public void run(String... args) {
        List<AisTrack> aisTracks = aisRepository.findAll();
        aisTracks.forEach(System.out::println);
    }
}
