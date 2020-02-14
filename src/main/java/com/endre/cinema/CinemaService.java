package com.endre.cinema;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CinemaService {

    private List<String> movies = new ArrayList<>();

    public CinemaService(){
        movies.add("Avengers Endgame");
        movies.add("Star Wars Episode IV");
    }

    public List<String> getMovies(){
        return movies;
    }
}
