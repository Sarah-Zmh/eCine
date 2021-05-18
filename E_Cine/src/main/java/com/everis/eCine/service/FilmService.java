package com.everis.eCine.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import com.everis.eCine.model.Film;
import com.everis.eCine.repository.FilmRepository;

@Service
public class FilmService extends AbstractService<Film, Long> {

	@Autowired
	private FilmRepository filmRepository;

	@Override
	protected JpaRepository<Film, Long> getRepository() {
		return filmRepository;
	}

}
