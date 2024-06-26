package br.com.alura.screenmatch.models;

import br.com.alura.screenmatch.calculations.StarRating;

public class Episode implements StarRating {
    private int number;
    private String name;
    private Serie serie;
    private int totalViews;

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Serie getSerie() {
        return serie;
    }

    public void setSerie(Serie serie) {
        this.serie = serie;
    }

    public int getTotalViews() {
        return totalViews;
    }

    public void setTotalViews(int totalViews) {
        this.totalViews = totalViews;
    }

    @Override
    public int getStarRating() {
        if (totalViews > 100){
            return 4;
        }else{
            return 2;
        }
    }
}
