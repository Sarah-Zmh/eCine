package com.everis.eCine.model;

import java.time.LocalDate;
import java.time.LocalTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Seance extends AbstractModel<Long> {
	@Column(name = "date_projection")
	private LocalDate dateProjection;

	@Column(name = "heure_debut")
	private LocalTime heureDebut;

	@Column(name = "heure_fin")
	private LocalTime heureFin;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "Film_ID")
	private Film film;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "salle_ID")
	private Salle salle;
}
