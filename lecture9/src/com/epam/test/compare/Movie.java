package com.epam.test.compare;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Movie implements Comparable<Movie> {
    private double rating;
    private String name;
    private int year;

    public Movie(String nm, double rt, int yr) {
        this.name = nm;
        this.rating = rt;
        this.year = yr;
    }

    public double getRating() {
        return rating;
    }

    public String getName() {
        return name;
    }

    public int getYear() {
        return year;
    }

    @Override
//    public int compareTo(Movie o) {
//        return 0;
//    }
    public int compareTo(Movie anotherMovie) {
        // return  anotherMovie.year-this.year;
        return this.year - anotherMovie.year;
    }

    static class RatingCompare implements Comparator<Movie> {
        //        @Override
//        public int compare(Movie o1, Movie o2) {
//            return 0;
//        }
        public int compare(Movie m1, Movie m2) {
            return Double.compare(m1.getRating(), m2.getRating());
        }
    }

    static class NameCompare implements Comparator<Movie> {
        public int compare(Movie m1, Movie m2) {

            return m1.getName().compareTo(m2.getName());
        }
    }
}

class Main {
    public static void main(String[] args) {
        List<Movie> listOfMovies = new ArrayList<>();
        listOfMovies.add(new Movie("Force Awakens", 8.3, 2015));
        listOfMovies.add(new Movie("Star Wars", 8.7, 1977));
        listOfMovies.add(new Movie("Empire Strikes Back", 8.8, 1980));
        listOfMovies.add(new Movie("Return of the Jedi", 8.4, 1983));

        Collections.sort(listOfMovies);

        System.out.println("Movies after sorting : ");
        for (Movie movie : listOfMovies) {
            System.out.println(movie.getName() + " " + movie.getRating() + " " + movie.getYear());
        }

        System.out.println("Sorted by rating");
        Movie.RatingCompare ratingCompare = new Movie.RatingCompare();
        Collections.sort(listOfMovies, ratingCompare);
        for (Movie movie : listOfMovies)
            System.out.println(movie.getRating() + " " + movie.getName() + " " + movie.getYear());

        System.out.println("\nSorted by name");
        Movie.NameCompare nameCompare = new Movie.NameCompare();
        Collections.sort(listOfMovies, nameCompare);
        for (Movie movie : listOfMovies)
            System.out.println(movie.getName() + " " + movie.getRating() + " " + movie.getYear());
    }
}
