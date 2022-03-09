package com.devsuperior.dsmovie.entities;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "tb_movie")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Movie {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String title;
	private Double score;
	private Integer count;
	private String image;
	
	@OneToMany(mappedBy = "id.movie")
	@Setter(AccessLevel.NONE)
	private Set<Score> scores = new HashSet<>();
	
}
