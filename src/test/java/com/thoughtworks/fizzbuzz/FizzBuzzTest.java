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
}
