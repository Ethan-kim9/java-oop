package me.oop.basic.capsule.ch02;


public class Rental {
    private final Movie movie;
    private final int daysRented;

    public Rental(Movie movie, int daysRented) {
        this.movie = movie;
        this.daysRented = daysRented;
    }

    public int getFrequentRenterPoints(int daysRented){
        return movie.getFrequentRenterPoints(daysRented);
    }
}
