package br.com.alura.screenmatch.models;

public class Title implements Comparable<Title> {
    private String name;
    private int releaseYear;
    private boolean includedInSubscription;
    private double ratingsSum;
    private int totalRatings;
    private int durationMinutes;

    public Title(String name, int releaseYear) {
        this.name = name;
        this.releaseYear = releaseYear;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setReleaseYear(int releaseYear){
        this.releaseYear = releaseYear;
    }

    public void setIncludedInSubscription(boolean includedInSubscription){
        this.includedInSubscription = includedInSubscription;
    }

    public void setDurationMinutes(int durationMinutes){

        this.durationMinutes = durationMinutes;
    }

    public String getName(){

        return this.name;
    }

    public int getReleaseYear(){
        return this.releaseYear;
    }

    public boolean isIncludedInSubscription(){

        return this.includedInSubscription;
    }
    public int getTotalRatings(){
        return this.totalRatings;
    }

    public int getDurationMinutes(){

        return this.durationMinutes = durationMinutes;
    }


    public void showTechnicalSpecifications (){
        System.out.println("Nome do filme: " + this.name);
        System.out.println("Ano de lançamento: " + this.releaseYear);
        System.out.println("Nota: " + this.calculateAverageRating());
        System.out.println("Total de avaliações: " + this.totalRatings);
        System.out.println("Duração: " + this.durationMinutes + " minutos");
    }

    public void rateMovie (double rate){
        ratingsSum += rate;
        totalRatings++;
    }

    double calculateAverageRating (){
        return ratingsSum/totalRatings;
    }

    @Override
    public int compareTo(Title anotherTitle) {
        return this.getName().compareTo(anotherTitle.getName());
    }
}
