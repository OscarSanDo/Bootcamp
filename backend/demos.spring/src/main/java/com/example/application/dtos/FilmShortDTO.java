package com.example.application.dtos;

import com.example.domains.entities.Film;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Value;

@Value
public class FilmShortDTO {
	@JsonProperty("id")
	private int filmId;
	@JsonProperty("titulo")
	private String title;
	
	public static FilmShortDTO from(Film source) {
		return new FilmShortDTO(
				source.getFilmId(),
				source.getTitle()
				);
	}
}