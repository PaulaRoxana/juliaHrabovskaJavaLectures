package com.epam.test.compare;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Movie2 implements Comparable<Movie2>{
    private double rating;
    private String name;
    private int year;

    public Movie2(String nm, double rt, int yr) {
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

//    @Override
//    public int compareTo(Movie o) {
//        return 0;
//    }
     public int compareTo(Movie2 anotherMovie) {
        return  this.year-anotherMovie.year;
    }

    static class RatingCompare implements Comparator<Movie2> {
//        @Override
//        public int compare(Movie o1, Movie o2) {
//            return 0;
//        }
        public int compare(Movie2 m1, Movie2 m2) {
            return Double.compare(m1.getRating(), m2.getRating());
        }
    }

    static class NameCompare implements Comparator<Movie2> {
        public int compare(Movie2 m1, Movie2 m2) {

            return m1.getName().compareTo(m2.getName());
        }
    }
}

    class Main2 {
        public static void main(String[] args) {
            List<Movie2> listOfMovies = new ArrayList<>();
            listOfMovies.add(new Movie2("Force Awakens", 8.3, 2015));
            listOfMovies.add(new Movie2("Star Wars", 8.7, 1977));
            listOfMovies.add(new Movie2("Empire Strikes Back", 8.8, 1980));
            listOfMovies.add(new Movie2("Return of the Jedi", 8.4, 1983));

            Collections.sort(listOfMovies);

            System.out.println("Movies after sorting : ");
            for (Movie2 movie : listOfMovies) {
                System.out.println(movie.getName() + " " + movie.getRating() + " " + movie.getYear());
            }

            System.out.println("Sorted by rating");
            Movie2.RatingCompare ratingCompare = new Movie2.RatingCompare();
            Collections.sort(listOfMovies, ratingCompare);
            for (Movie2 movie : listOfMovies)
                System.out.println(movie.getRating() + " " + movie.getName() + " " + movie.getYear());

            System.out.println("\nSorted by name");
            Movie2.NameCompare nameCompare = new Movie2.NameCompare();
            Collections.sort(listOfMovies, nameCompare);
            for (Movie2 movie : listOfMovies)
                System.out.println(movie.getName() + " " + movie.getRating() + " " + movie.getYear());
        }
    }