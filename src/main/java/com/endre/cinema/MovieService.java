package com.endre.cinema;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class MovieService {

    @Autowired
    private MovieRepository movieRepository;


    public List<MovieDto> getMovies(){
        List<MovieDto> movies = new ArrayList<>();
        movieRepository.findAll().forEach(movie ->
                movies.add(new MovieDto(movie.getTitle(), movie.getAgeLimit())));
        return movies;
    }

    public Integer createMovie(MovieDto movie) {
        var movieEntity = new MovieEntity();
        movieEntity.setAgeLimit(movie.getAgeLimit());
        movieEntity.setTitle(movie.getTitle());

        return movieRepository.save(movieEntity).getId();
    }
}
