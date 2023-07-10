package com.app.service;

import java.util.List;

import com.app.dto.MUpdatedto;
import com.app.dto.MovieDto;
import com.app.entities.Movie;



public interface MovieService {
List<Movie> getAllMovies();

String addMovie(MovieDto dt);

String upDateMovie(Long movieno,Movie m);

//Movie getMovieByDname(String director,Movie m );
}
