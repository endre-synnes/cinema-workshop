package com.endre.cinema;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class MovieService {

    @Autowired
    private MovieRepository movieRepository;


    public List<MovieEntity> getMovies(){
        List<MovieEntity> movies = new ArrayList<>();
        movieRepository.findAll().forEach(movies::add);
        return movies;
    }

    public Integer createMovie(MovieDto movie) {
        var movieEntity = new MovieEntity();
        movieEntity.setAgeLimit(movie.getAgeLimit());
        movieEntity.setTitle(movie.getTitle());

        return movieRepository.save(movieEntity).getId();
    }
}
