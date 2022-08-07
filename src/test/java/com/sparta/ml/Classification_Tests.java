package com.sparta.ml;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class Classification_Tests {

    @ParameterizedTest
    @DisplayName("U & PG films are available.")
    @ValueSource(ints = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11} )
    void under12(int age){
        Assertions.assertTrue(age < 12);
    }

    @ParameterizedTest
    @DisplayName("U, PG, 12A & 12 films")
    @ValueSource(ints = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14} )
    void under15(int age){
        Assertions.assertTrue(age < 15);
    }

    @ParameterizedTest
    @DisplayName("U, PG, 12A, 12 & 15 films")
    @ValueSource(ints = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17} )
    void under18(int age){
        Assertions.assertTrue(age < 18);
    }

    @Test
    @DisplayName("All films except R18.")
    void adultsOver17(){
        int age = 21;
        boolean license = false;
        Assertions.assertEquals("All films are available except R18 films.", FilmClassifications.availableClassifications(age, license));
    }

    @Test
    @DisplayName("All films & R18 for licensed premises.")
    void adultsOver17R18(){
        int age = 25;
        boolean license = true;
        Assertions.assertEquals("All films are available including R18 films for licensed premises.", FilmClassifications.availableClassifications(age, license));
    }
}
