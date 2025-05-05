package com.spring.resolver;

import com.netflix.graphql.dgs.DgsComponent;
import com.netflix.graphql.dgs.DgsMutation;
import com.netflix.graphql.dgs.DgsQuery;
import com.netflix.graphql.dgs.InputArgument;
import com.spring.model.Movie;
import com.spring.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@DgsComponent
public class MovieResolver
{
    @Autowired
    private MovieService movieService;

    @DgsMutation
    public Movie insertMovie(@InputArgument("input") Movie movie)
    {
        return movieService.insertMovieToDB(movie);
    }

    @DgsQuery
    public List<Movie> fetchAllMovies()
    {
        return movieService.fetchMovies();
    }

   @DgsQuery
    public Movie fetchMovie(@InputArgument String id)
    {
        return movieService.getMovieById(id);
    }

    @DgsQuery
    public Movie fetchMovieByTitle(@InputArgument String title)
    {
        return movieService.getMovieByTitle(title);
    }
}
