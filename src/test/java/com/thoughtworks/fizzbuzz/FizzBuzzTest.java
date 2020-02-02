package com.thoughtworks.fizzbuzz;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FizzBuzzTest {

    @Test
    public void shouldReturnStringGivenNumber() {
        Integer input = 4;
        String result = FizzBuzz.fizzBuzz(input);
        assertEquals("4", result);
    }

    @Test
    public void shouldReturnFizzGivenMultiplierOf3() {
        Integer input = 3;
        String result = FizzBuzz.fizzBuzz(input);
        assertEquals("Fizz", result);
    }

    @Test
    public void shouldReturnBuzzGivenMultiplierOf5() {
        Integer input = 5;
        String result = FizzBuzz.fizzBuzz(input);
        assertEquals("Buzz", result);
    }

    @Test
    public void shouldReturnWhizzGivenMultiplierOf7() {
        Integer input = 7;
        String result = FizzBuzz.fizzBuzz(input);
        assertEquals("Whizz", result);
    }
}
