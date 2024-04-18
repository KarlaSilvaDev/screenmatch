package br.com.alura.screenmatch.main;

import br.com.alura.screenmatch.calculations.Classification;
import br.com.alura.screenmatch.calculations.TimeCalculator;
import br.com.alura.screenmatch.models.Episode;
import br.com.alura.screenmatch.models.Movie;
import br.com.alura.screenmatch.models.Serie;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Movie myMovie = new Movie("Forrest Gump", 1994);
        myMovie.setDurationMinutes(142);
        myMovie.setIncludedInSubscription(true);

        myMovie.showTechnicalSpecifications();

        myMovie.rateMovie(8);
        myMovie.rateMovie(5);
        myMovie.rateMovie(10);

        myMovie.showTechnicalSpecifications();

        Serie lost = new Serie("Lost", 2000);
        lost.showTechnicalSpecifications();
        lost.setSeasons(10);
        lost.setEpisodesPerSeason(10);
        lost.setMinutesPerEpisode(50);
        System.out.println("Duração para maratonar Lost: " + lost.getDurationMinutes());

        Movie anotherMovie = new Movie("O poderoso chefão", 1970);
        anotherMovie.setDurationMinutes(180);

        TimeCalculator calculator = new TimeCalculator();
        calculator.includes(myMovie);
        calculator.includes(anotherMovie);
        calculator.includes(lost);
        System.out.println(calculator.getTotalTime());

        Classification filter = new Classification();
        filter.checkRating(myMovie);

        Episode episode = new Episode();
        episode.setNumber(1);
        episode.setSerie(lost);
        episode.setTotalViews(300);

        filter.checkRating(episode);

        var newMovie = new Movie("Dogville", 2003);
        newMovie.setDurationMinutes(200);
        newMovie.rateMovie(10);

        ArrayList<Movie> moviesList = new ArrayList<>();
        moviesList.add(myMovie);
        moviesList.add(anotherMovie);
        moviesList.add(newMovie);
        System.out.println("Tamanho da lista: " + moviesList.size());
        System.out.println("Primeiro filme: " + moviesList.get(0).getName());
        System.out.println(moviesList);








    }
}
