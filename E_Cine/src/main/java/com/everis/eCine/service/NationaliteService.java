package com.everis.eCine.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import com.everis.eCine.model.Nationalite;
import com.everis.eCine.repository.NationaliteRepository;

@Service
public class NationaliteService extends AbstractService<Nationalite, Long> {

	@Autowired
	private NationaliteRepository nationaliteRepository;

	@Override
	protected JpaRepository<Nationalite, Long> getRepository() {
		return nationaliteRepository;
	}

}
