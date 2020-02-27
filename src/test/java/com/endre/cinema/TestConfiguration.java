package com.endre.cinema;

import org.springframework.context.annotation.Configuration;

@Configuration
public class TestConfiguration {

    public TestConfiguration(MovieRepository repository) {
        var movie = new MovieEntity();
        movie.setTitle("Dummy Title");
        movie.setAgeLimit(18);
        repository.save(movie);
    }
}
