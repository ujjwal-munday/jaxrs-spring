package com.spring.repository;

import com.spring.model.Movie;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface MovieRepository extends MongoRepository<Movie, String>
{
    Movie findMovieByTitle(String title);
}
