package com.endre.cinema;

import org.springframework.data.repository.CrudRepository;

public interface MovieRepository extends CrudRepository<MovieEntity, Integer> { }
