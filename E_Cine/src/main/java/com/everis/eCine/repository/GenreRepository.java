package com.everis.eCine.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.everis.eCine.model.Genre;

@Repository
public interface GenreRepository extends JpaRepository<Genre, Long> {

}
