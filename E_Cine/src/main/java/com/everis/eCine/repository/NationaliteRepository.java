package com.everis.eCine.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.everis.eCine.model.Nationalite;

@Repository
public interface NationaliteRepository extends JpaRepository<Nationalite, Long> {

}
