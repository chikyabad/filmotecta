package com.filmoteca.app.controllers;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.filmoteca.app.models.Film;

@RestController
@RequestMapping("/api")
public class FilmController {
	
	@GetMapping("/films")
	public String getAllFilms(){
		return "GET All films";
	}
	
	@GetMapping("/films/{id}")
	public Film getFilmById(@PathVariable("id") String id) {
		return new Film("1", "Abre los ojos");
	}
	
	@PostMapping("/films")
	public String createFilm(){
		return "POST a film";
	}
	
	@PutMapping("/films/{id}")
	public String updateFilmById(@PathVariable("id") String id) {
		return " PUT film with id "+id;
	}
	
	@DeleteMapping("/films")
	public String deleteAllFilms(){
		return "DELETE all films";
	}
	
	@DeleteMapping("/films/{id}")
	public String deleteFilmById(@PathVariable("id") String id) {
		return " DELETE film with id "+id;
	}

}
