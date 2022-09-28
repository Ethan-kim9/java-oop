package me.oop.basic.capsule.ch02;

public class Movie {
    public static int REGULAR = 0;
    public static int NEW_RELEASE = 1;
    private int priceCode;

    public int getPriceCode(){
        return priceCode;
    }

    public boolean isNewMovie(){
        if(priceCode == NEW_RELEASE){
            return true;
        }
        return false;
    }

    public int getFrequentRenterPoints(int daysRented){
        if(isNewMovie()){
            return 2;
        }
        return 1;
    }
}
