package com.everis.eCine.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.everis.eCine.model.Personne;

@Repository
public interface PersonneRepository extends JpaRepository<Personne, Long> {

}
