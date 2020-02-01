package com.thoughtworks.fizzbuzz;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FizzBuzzTest {
    @Test
    public void shouldReturnOriginValueOfNumber() {
        final FizzBuzz fizzBuzz = new FizzBuzz();

        final String result = fizzBuzz.fizzBuzz(4);

        assertEquals("4", result);
    }

    @Test
    public void shouldReturnFizzWhenNumberIsMultiplierOf3() {
        final FizzBuzz fizzBuzz = new FizzBuzz();

        final String result = fizzBuzz.fizzBuzz(12);

        assertEquals("Fizz", result);
    }

    @Test
    public void shouldReturnBuzzWhenNumberIsMultiplierOf5() {
        final FizzBuzz fizzBuzz = new FizzBuzz();

        final String result = fizzBuzz.fizzBuzz(25);

        assertEquals("Buzz", result);
    }

    @Test
    public void shouldReturnWhizzWhenNumberIsMultiplierOf7() {
        final FizzBuzz fizzBuzz = new FizzBuzz();

        final String result = fizzBuzz.fizzBuzz(49);

        assertEquals("Whizz", result);
    }

    @Test
    public void shouldReturnFizzBuzzWhenNumberIsMultiplierOf3And5() {
        final FizzBuzz fizzBuzz = new FizzBuzz();

        final String result = fizzBuzz.fizzBuzz(60);

        assertEquals("FizzBuzz", result);
    }

    @Test
    public void shouldReturnFizzWhizzWhenNumberIsMultiplierOf3And7() {
        final FizzBuzz fizzBuzz = new FizzBuzz();

        final String result = fizzBuzz.fizzBuzz(42);

        assertEquals("FizzWhizz", result);
    }

    @Test
    public void shouldReturnBuzzWhizzWhenNumberIsMultiplierOf5And7() {
        final FizzBuzz fizzBuzz = new FizzBuzz();

        final String result = fizzBuzz.fizzBuzz(70);

        assertEquals("BuzzWhizz", result);
    }
}
