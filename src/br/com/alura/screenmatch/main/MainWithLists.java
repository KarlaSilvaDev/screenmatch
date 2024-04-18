package br.com.alura.screenmatch.main;

import br.com.alura.screenmatch.models.Movie;
import br.com.alura.screenmatch.models.Serie;
import br.com.alura.screenmatch.models.Title;

import java.util.*;

public class MainWithLists {
    public static void main(String[] args) {
        Movie movie1 = new Movie("Forrest Gump", 1994);
        Movie movie2 = new Movie("O poderoso chefão", 1970);
        Movie movie3 = new Movie("Dogville", 2003);
        Serie serie1 = new Serie("Lost", 2000);

        movie1.rateMovie(9);
        movie2.rateMovie(6);
        movie3.rateMovie(10);

        List<Title> list = new ArrayList<>();
        list.add(movie1);
        list.add(movie2);
        list.add(movie3);
        list.add(serie1);

        for (Title item : list){
            System.out.println(item.getName());
            //Não é a forma mais elegante
            if (item instanceof Movie movie){
                System.out.println("Classificação: " + movie.getStarRating());
            }
        }

        List<String> searchArtist = new ArrayList<>();
        searchArtist.add("Adam Sandler");
        searchArtist.add("Tom Cruise");
        searchArtist.add("Julia Roberts");
        System.out.println(searchArtist);

        Collections.sort(searchArtist);
        System.out.println(searchArtist);

        Collections.sort(list);
        System.out.println(list);

        list.sort(Comparator.comparing(Title::getReleaseYear));
        System.out.println(list);

    }
}
