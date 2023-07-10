package com.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.dto.MovieDto;
import com.app.entities.Movie;
import com.app.service.MovieService;

@RestController
@RequestMapping("/movies")
public class MovieController {
	@Autowired
	private MovieService movieser;
	@GetMapping
	public List<Movie> getaAllMovies(){
		return movieser.getAllMovies();
	}
	@PostMapping
	public String addMovie(@RequestBody MovieDto dt) {
		movieser.addMovie(dt);
		return "Movie Added sucessfully";
	}
	@PutMapping("/{movieno}")
public String UpdateMovie(@PathVariable Long movieno,Movie m) {
	return movieser.upDateMovie(movieno,m);
}
//	@GetMapping("/{director}")
//	public  Movie getMovieByDirector(@PathVariable String director,Movie m) {
//		return movieser.getMovieByDname(director, m);
//	}
}
