package com.everis.eCine.repository;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.everis.eCine.model.Film;
import com.everis.eCine.model.Seance;

@Repository
public interface SeanceRepository extends JpaRepository<Seance, Long> {
	public List<Seance> findByDateProjectionAndFilmAndHeureDebut(LocalDate dateProjection, Film film,
			LocalTime heureDebut);

}
