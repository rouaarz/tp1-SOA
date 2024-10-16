package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.entity.Offre;
import com.example.demo.repository.Offre_repository;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner {

    @Autowired
    Offre_repository offreRepository;

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        // Ajout des offres dans la base de données
        offreRepository.save(new Offre("Web Design", "informatique", "AXA", 2, "France"));
        offreRepository.save(new Offre("Developpeur", "informatique", "Talys", 3, "Tunisie"));
        offreRepository.save(new Offre("Architecte", "informatique", "SIS", 2, "Allemagne"));
        offreRepository.save(new Offre("Admin", "informatique", "TT", 1, "Tunisie"));
    }
}
