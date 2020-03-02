package com.endre.cinema;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MovieRepository extends CrudRepository<MovieEntity, Integer> { }
