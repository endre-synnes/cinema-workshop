package com.endre.cinema;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/cinema")
public class CinemaController {

    @Autowired
    private CinemaService cinemaService;

    @GetMapping
    public List<MovieDto> getMovies(){
        return cinemaService.getMovies();
    }

    @PostMapping
    public MovieDto createMovie(@RequestBody MovieDto movie){
        return cinemaService.createMovie(movie);
    }
}
