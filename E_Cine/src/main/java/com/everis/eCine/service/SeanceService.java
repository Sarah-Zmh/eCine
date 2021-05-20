package com.everis.eCine.service;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import com.everis.eCine.model.Film;
import com.everis.eCine.model.Seance;
import com.everis.eCine.repository.SeanceRepository;

@Service
public class SeanceService extends AbstractService<Seance, Long> {

	@Autowired
	private SeanceRepository seanceRepository;

	@Override
	protected JpaRepository<Seance, Long> getRepository() {
		return seanceRepository;
	}

	public List<Seance> getListSeances(LocalDate dateProjection, Film film, LocalTime heureDebut) {
		return seanceRepository.findByDateProjectionAndFilmAndHeureDebut(dateProjection, film, heureDebut);
	}
}
