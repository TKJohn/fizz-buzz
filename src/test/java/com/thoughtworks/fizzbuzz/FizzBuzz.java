package com.thoughtworks.fizzbuzz;

import java.util.function.Predicate;

public class FizzBuzz {
    public String fizzBuzz(final int i) {
        final MultiplierPredictor multiplierOf3 = new MultiplierPredictor(3);
        final MultiplierPredictor multiplierOf5 = new MultiplierPredictor(5);
        final MultiplierPredictor multiplierOf7 = new MultiplierPredictor(7);

        if (multiplierOf3.and(multiplierOf5).and(multiplierOf7).test(i)) return "FizzBuzzWhizz";
        if (multiplierOf3.and(multiplierOf5).test(i)) return "FizzBuzz";
        if (multiplierOf3.and(multiplierOf7).test(i)) return "FizzWhizz";
        if (multiplierOf5.and(multiplierOf7).test(i)) return "BuzzWhizz";
        if (multiplierOf3.test(i)) return "Fizz";
        if (multiplierOf5.test(i)) return "Buzz";
        if (multiplierOf7.test(i)) return "Whizz";
        return String.valueOf(i);
    }

    private static class MultiplierPredictor implements Predicate<Integer> {
        final private Integer base;

        public MultiplierPredictor(Integer base) {
            this.base = base;
        }

        @Override
        public boolean test(final Integer input) {
            return input % this.base == 0;
        }
    }
}
