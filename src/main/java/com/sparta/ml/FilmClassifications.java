package com.sparta.ml;

public class FilmClassifications {

    public static String availableClassifications(int ageOfViewer, boolean licensedPremise) {
        String result;

        if (ageOfViewer < 12) {
            result = "U & PG films are available.";
        }
        else if (ageOfViewer < 15) {
            result = "U, PG, 12A & 12 films are available.";
        }
        else if (ageOfViewer < 18) {
            result = "U, PG, 12A, 12 & 15 films are available.";
        }
        else if (ageOfViewer >= 18 && licensedPremise) {
            result = "All films are available including R18 films for licensed premises.";
        }
        else{
            result = "All films are available except R18 films.";
        }
        return result;
    }
}
