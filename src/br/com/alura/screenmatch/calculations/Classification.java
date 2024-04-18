package br.com.alura.screenmatch.calculations;

public class Classification {
    public void checkRating(StarRating starRating){
        if (starRating.getStarRating() >= 4){
            System.out.println("está entre os preferidos do momento.");
        }else if (starRating.getStarRating() >= 2){
            System.out.println("Muito bem avaliado no momento.");
        }else{
            System.out.println("Coloque na sua lista para assistir depois.");
        }
    }
}
