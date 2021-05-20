package com.everis.eCine.controller;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.everis.eCine.model.Film;
import com.everis.eCine.model.Seance;
import com.everis.eCine.service.FilmService;
import com.everis.eCine.service.SeanceService;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class SeanceController {
	private SeanceService seanceService;
	private FilmService filmService;

	@Autowired
	public void setSeanceService(SeanceService seanceService) {
		this.seanceService = seanceService;
	}

	@Autowired
	public void setFilmService(FilmService filmService) {
		this.filmService = filmService;
	}

	@GetMapping("/allSeances")
	public List<Seance> getAllSeances() {

		return seanceService.getListAll();
	}

	@GetMapping("/seances")
	public List<Seance> getSeances(@RequestParam String film,
			@RequestParam @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate dateProjection,
			@RequestParam @DateTimeFormat(iso = DateTimeFormat.ISO.TIME) LocalTime heureDebut) {
		Film film2 = filmService.getFilmByTitre(film);

		return seanceService.getListSeances(dateProjection, film2, heureDebut);
	}
	@GetMapping("/localdate")
	public LocalDate localDate(@DateTimeFormat(iso = DateTimeFormat.ISO.DATE)LocalDate date) {
	    return date;
}
}
