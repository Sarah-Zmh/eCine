package com.everis.eCine.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.everis.eCine.model.Film;

@Repository
public interface FilmRepository extends JpaRepository<Film, Long> {
	public Film findByTitre(String titre);

}
