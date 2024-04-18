package br.com.alura.screenmatch.calculations;

import br.com.alura.screenmatch.models.Title;

public class TimeCalculator {
    private int totalTime;

    public int getTotalTime() {
        return this.totalTime;
    }

//    public void includes (Movie movie){
//        this.totalTime += movie.getDurationMinutes();
//    }
//
//    public void includes (Serie serie){
//        this.totalTime += serie.getDurationMinutes();
//    }

    public void includes (Title title){
        this.totalTime += title.getDurationMinutes();
    }
}
