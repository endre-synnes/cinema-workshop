package com.endre.cinema;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/movies")
public class MovieController {

    @Autowired
    private MovieService movieService;

    @GetMapping
    public Iterable<MovieEntity> getMovies() {
        return movieService.getMovies();
    }

    @PostMapping
    public Integer createMovie(@RequestBody MovieDto movie){
        return movieService.createMovie(movie);
    }
}
