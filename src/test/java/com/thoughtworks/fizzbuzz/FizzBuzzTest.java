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
}
