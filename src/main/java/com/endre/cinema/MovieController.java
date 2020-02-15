package com.endre.cinema;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/movies")
public class MovieController {

    @GetMapping
    public String getMovies(){
        return "Avengers Endgame";
    }
}
