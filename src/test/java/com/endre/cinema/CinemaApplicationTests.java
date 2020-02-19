package com.endre.cinema;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CinemaApplicationTests {

    @Autowired
    private MovieService movieService;

    @Test
    public void testThatMovieHasBeenAddedToDatabase() {
        var numberOfMoviesInDb = movieService.getMovies().size();
        var movieDto = new MovieDto("Star Wars", 14);
        movieService.createMovie(movieDto);
        assertTrue(movieService.getMovies().size() > numberOfMoviesInDb);
    }
}
