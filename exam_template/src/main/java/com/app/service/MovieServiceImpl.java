package com.app.service;

import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.dto.MUpdatedto;
import com.app.dto.MovieDto;
import com.app.entities.Movie;
import com.app.repository.MovieRepository;
@Service
@org.springframework.transaction.annotation.Transactional
public class MovieServiceImpl implements MovieService {
	@Autowired
private MovieRepository movieRepo;

	@Autowired
	private ModelMapper mapss;
	@Override
	public List<Movie> getAllMovies() {
		System.out.println("in getall movie");
		return movieRepo.findAll();
	}

	@Override
	public String addMovie(MovieDto dt) {
		String msg="movie added";
		Movie m=mapss.map(dt, Movie.class);
		movieRepo.save(m);
		return "msg";
	}

	

//	@Override
//	public Movie getMovieByDname(String director,Movie m) {
//		 movieRepo.FindByDirector(m.getDirector());
//		return m;
//	}

	@Override
	public String upDateMovie(Long movieno, Movie m) {
		movieRepo.save(m);
		return "updated";
	}


//	@Override
//	public Movie getMovieByDname(String director) {
//		Movie m=
//		return null;
//	}


	
	
}
