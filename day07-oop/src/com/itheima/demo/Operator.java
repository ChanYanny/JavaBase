package com.itheima.demo;

/**
 * @author ChanYanny
 * @date 2025/02/21 11:18
 **/
public class Operator {
    private Movie[] movies;

    public Operator(Movie[] movies) {
        this.movies = movies;
    }

    public void showAllMovies() {
        for (Movie movie : movies) {
            System.out.println(movie.getId());
            System.out.println(movie.getName());
            System.out.println(movie.getDirector());
            System.out.println(movie.getPrice());
            System.out.println(movie.getScore());
        }
    }
}

