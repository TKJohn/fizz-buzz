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

        final String result = fizzBuzz.fizzBuzz(140);

        assertEquals("BuzzWhizz", result);
    }

    @Test
    public void shouldReturnFizzBuzzWhizzWhizzWhenNumberIsMultiplierOf3And5And7() {
        final FizzBuzz fizzBuzz = new FizzBuzz();

        final String result = fizzBuzz.fizzBuzz(210);

        assertEquals("FizzBuzzWhizz", result);
    }

    @Test
    public void shouldReturnFizzWhenNumberContains3() {
        final FizzBuzz fizzBuzz = new FizzBuzz();

        final String result = fizzBuzz.fizzBuzz(13);

        assertEquals("Fizz", result);
    }

    @Test
    public void shouldReturnFizzWhenNumberContains3AndIsMultiplierOf5Or7() {
        final FizzBuzz fizzBuzz = new FizzBuzz();

        final String result = fizzBuzz.fizzBuzz(630);

        assertEquals("Fizz", result);
    }

    @Test
    public void shouldReturnBuzzWhenNumberContains5() {
        final FizzBuzz fizzBuzz = new FizzBuzz();

        final String result = fizzBuzz.fizzBuzz(51);

        assertEquals("Buzz", result);
    }

    @Test
    public void shouldReturnBuzzWhenNumberContains5AndIsMultiplierOf3Or7() {
        final FizzBuzz fizzBuzz = new FizzBuzz();

        final String result = fizzBuzz.fizzBuzz(105);

        assertEquals("Buzz", result);
    }

    @Test
    public void shouldReturnBuzzWhenNumberContains5AndContains3() {
        final FizzBuzz fizzBuzz = new FizzBuzz();

        final String result = fizzBuzz.fizzBuzz(35);

        assertEquals("Buzz", result);
    }


    @Test
    public void shouldReturnWhizzWhenNumberContains7() {
        final FizzBuzz fizzBuzz = new FizzBuzz();

        final String result = fizzBuzz.fizzBuzz(17);

        assertEquals("Whizz", result);
    }

    @Test
    public void shouldReturnWhizzWhenNumberContains7AndIsMultiplierOf3Or5() {
        final FizzBuzz fizzBuzz = new FizzBuzz();

        final String result = fizzBuzz.fizzBuzz(270);

        assertEquals("Whizz", result);
    }

    @Test
    public void shouldReturnWhizzWhenNumberContains7AndContains3Or5() {
        final FizzBuzz fizzBuzz = new FizzBuzz();

        final String result = fizzBuzz.fizzBuzz(357);

        assertEquals("Whizz", result);
    }
}
