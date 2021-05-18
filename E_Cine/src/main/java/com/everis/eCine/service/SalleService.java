package com.everis.eCine.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import com.everis.eCine.model.Salle;
import com.everis.eCine.repository.SalleRepository;

@Service
public class SalleService extends AbstractService<Salle, Long> {

    @Autowired
    private SalleRepository salleRepository;

    @Override
    protected JpaRepository<Salle, Long> getRepository() {
        return salleRepository;
    }

}
