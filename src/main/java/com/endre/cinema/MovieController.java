package com.endre.cinema;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/movies")
public class MovieController {

    @Autowired
    private MovieService movieService;

    @GetMapping
    public List<MovieDto> getMovies() {
        return movieService.getMovies();
    }

    @PostMapping
    public MovieDto createMovie(@RequestBody MovieDto movie){
        return movieService.createMovie(movie);
    }
}
