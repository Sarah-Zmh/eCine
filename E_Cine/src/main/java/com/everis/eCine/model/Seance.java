package com.everis.eCine.model;



import java.util.Date;

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
public class Seance extends AbstractModel<Long>{
	@Column(name = "date_projection")
    private Date dateProjection;
	
	@Column(name = "heure_debut")
    private java.sql.Time heureDebut;
	
	@Column(name = "heure_fin")
    private java.sql.Time heureFin;
	
	@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="Film_ID")
    private Film film;
	
	@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="salle_ID")
    private Salle salle;
}
