package com.endre.cinema;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MovieService {

    @Autowired
    private MovieRepository movieRepository;


    public Iterable<MovieEntity> getMovies(){
        return movieRepository.findAll();
    }

    public Integer createMovie(MovieDto movie) {
        var movieEntity = new MovieEntity();
        movieEntity.setAgeLimit(movie.getAgeLimit());
        movieEntity.setTitle(movie.getTitle());

        return movieRepository.save(movieEntity).getId();
    }
}
