package com.sparta.ml;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class GreeterTests {

    @Test
    @DisplayName("Expecting: Good Morning")
    void expectingGoodMorning() {
        int time = 10;
        Assertions.assertEquals("Good Morning", Greeter.getGreeting(time));
    }

    @Test
    @DisplayName("Expecting: Good Afternoon")
    void expectingGoodAfternoon() {
        int time = 13;
        Assertions.assertEquals("Good Afternoon", Greeter.getGreeting(time));
    }

    @Test
    @DisplayName("Expecting: Good Evening")
    void expectingGoodEvening(){
        int time = 21;
        Assertions.assertEquals("Good Evening", Greeter.getGreeting(time));
    }

    //Parameterized Testing:
    @ParameterizedTest
    @DisplayName("Parameterized Test - Good Morning")
    @ValueSource(ints = {5, 6, 7, 8, 9, 10, 11, 12})
    void checkForMultipleValuesInATest(int number){
        Assertions.assertTrue(number < 13);
    }

}
