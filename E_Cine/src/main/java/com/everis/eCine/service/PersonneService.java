package com.everis.eCine.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import com.everis.eCine.model.Personne;
import com.everis.eCine.repository.PersonneRepository;

@Service
public class PersonneService extends AbstractService<Personne, Long> {

	@Autowired
	private PersonneRepository personneRepository;

	@Override
	protected JpaRepository<Personne, Long> getRepository() {
		return personneRepository;
	}

}
