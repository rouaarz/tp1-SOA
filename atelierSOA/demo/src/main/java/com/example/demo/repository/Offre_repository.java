package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Offre;

@Repository
public interface Offre_repository extends  JpaRepository<Offre, Long> {
	
}
