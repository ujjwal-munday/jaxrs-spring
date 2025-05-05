package com.spring.service;

import com.spring.model.Movie;
import com.spring.repository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovieService
{
    @Autowired
    private MovieRepository movieRepository;

    public List<Movie> fetchMovies()
    {
        return movieRepository.findAll();
    }

    public Movie getMovieById(String id)
    {
        return movieRepository.findById(id).orElse(null);
    }

    public Movie getMovieByTitle(String title)
    {
        return movieRepository.findMovieByTitle(title);
    }

    public Movie insertMovieToDB(Movie input)
    {
        Movie movie = Movie.builder()
                .title(input.getTitle())
                .genre(input.getGenre())
                .releaseDate(input.getReleaseDate())
                .availableCopies(input.getAvailableCopies()).build();

        return movieRepository.save(movie);
    }
}
