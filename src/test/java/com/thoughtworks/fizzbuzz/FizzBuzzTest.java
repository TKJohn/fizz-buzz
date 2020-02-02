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

    @Test
    public void shouldReturnFizzBuzzGivenMultiplierOf3And5() {
        Integer input = 15;
        String result = FizzBuzz.fizzBuzz(input);
        assertEquals("FizzBuzz", result);
    }

    @Test
    public void shouldReturnFizzWhizzGivenMultiplierOf3And7() {
        Integer input = 21;
        String result = FizzBuzz.fizzBuzz(input);
        assertEquals("FizzWhizz", result);
    }

    @Test
    public void shouldReturnBuzzWhizzGivenMultiplierOf5And7() {
        Integer input = 35;
        String result = FizzBuzz.fizzBuzz(input);
        assertEquals("BuzzWhizz", result);
    }

    @Test
    public void shouldReturnFizzBuzzWhizzGivenMultiplierOf3And5And7() {
        Integer input = 105;
        String result = FizzBuzz.fizzBuzz(input);
        assertEquals("FizzBuzzWhizz", result);
    }
}
