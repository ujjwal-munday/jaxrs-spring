//package com.spring.controller;
//
//import com.spring.model.Movie;
//import com.spring.service.MovieService;
//import jakarta.inject.Inject;
//import jakarta.ws.rs.*;
//import jakarta.ws.rs.core.MediaType;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Component;
//
//import java.util.List;
//
//@Path("/movie")
//@Component
//public class MovieController
//{
//    @Inject
//    private MovieService movieService;
//
//    @POST
//    @Path("/insert")
//    @Consumes(MediaType.APPLICATION_JSON)
//    @Produces(MediaType.APPLICATION_JSON)
//    public Movie insertMovie(Movie movie)
//    {
//        return movieService.insertMovieToDB(movie);
//    }
//
//    @GET
//    @Path("/fetch")
//    @Produces(MediaType.APPLICATION_JSON)
//    public List<Movie> fetchAllMovies()
//    {
//        return movieService.fetchMovies();
//    }
//
//    @GET
//    @Path("/id/{id}")
//    @Produces(MediaType.APPLICATION_JSON)
//    public Movie fetchMovie(@PathParam("id") String id)
//    {
//        return movieService.getMovieById(id);
//    }
//
//    @GET
//    @Path("/title/{title}")
//    @Produces(MediaType.APPLICATION_JSON)
//    public Movie fetchMovieByTitle(@PathParam("title") String title)
//    {
//        return movieService.getMovieByTitle(title);
//    }
//}
