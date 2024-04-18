package br.com.alura.screenmatch.models;

import br.com.alura.screenmatch.calculations.StarRating;

public class Movie extends Title implements StarRating {
    private String director;

    public Movie(String name, int releaseYear) {
        super(name, releaseYear);
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    @Override
    public int getStarRating() {
        return (int) calculateAverageRating() /2;
    }

    @Override
    public String toString() {
        return "Filme : " + this.getName() + " (" + this.getReleaseYear() + ")";
    }
}
