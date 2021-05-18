package com.everis.eCine.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.everis.eCine.model.Seance;

@Repository
public interface SeanceRepository extends JpaRepository<Seance, Long> {

}
