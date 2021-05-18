package com.everis.eCine.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.everis.eCine.model.Salle;

@Repository
public interface SalleRepository extends JpaRepository<Salle, Long> {

}
