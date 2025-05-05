package com.spring.controller;

import com.spring.model.Movie;
import com.spring.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/movie")
public class MovieAppController
{
    @Autowired
    private MovieService movieService;

    @PostMapping("/insert")
    public Movie insertMovie(@RequestBody Movie movie)
    {
        return movieService.insertMovieToDB(movie);
    }

    @GetMapping("/fetch")
    public List<Movie> fetchAllMovies()
    {
        return movieService.fetchMovies();
    }

    @GetMapping("/id/{id}")
    public Movie fetchMovie(@PathVariable("id") String id)
    {
        return movieService.getMovieById(id);
    }

    @GetMapping("title/{title}")
    public Movie fetchMovieByTitle(@PathVariable("title") String title)
    {
        return movieService.getMovieByTitle(title);
    }
}
