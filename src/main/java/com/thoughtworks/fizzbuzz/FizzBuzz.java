package com.thoughtworks.fizzbuzz;

import java.util.function.Predicate;

public class FizzBuzz {

    private static final String FIZZ = "Fizz";
    private static final String BUZZ = "Buzz";
    private static final String WHIZZ = "Whizz";
    private static final String FIZZ_BUZZ = FIZZ + BUZZ;
    private static final String FIZZ_WHIZZ = FIZZ + WHIZZ;
    private static final String BUZZ_WHIZZ = BUZZ + WHIZZ;
    private static final String FIZZ_BUZZ_WHIZZ = FIZZ + BUZZ + WHIZZ;

    private static final ContainsPredictor contains3 = new ContainsPredictor(3);
    private static final ContainsPredictor contains5 = new ContainsPredictor(5);
    private static final ContainsPredictor contains7 = new ContainsPredictor(7);

    private static final MultiplierPredictor multiplierOf3 = new MultiplierPredictor(3);
    private static final MultiplierPredictor multiplierOf5 = new MultiplierPredictor(5);
    private static final MultiplierPredictor multiplierOf7 = new MultiplierPredictor(7);

    public String fizzBuzz(final int i) {

        if (contains7.test(i)) return WHIZZ;
        if (contains5.test(i)) return BUZZ;
        if (contains3.test(i)) return FIZZ;

        if (multiplierOf3.and(multiplierOf5).and(multiplierOf7).test(i)) return FIZZ_BUZZ_WHIZZ;
        if (multiplierOf3.and(multiplierOf5).test(i)) return FIZZ_BUZZ;
        if (multiplierOf3.and(multiplierOf7).test(i)) return FIZZ_WHIZZ;
        if (multiplierOf5.and(multiplierOf7).test(i)) return BUZZ_WHIZZ;

        if (multiplierOf3.test(i)) return FIZZ;
        if (multiplierOf5.test(i)) return BUZZ;
        if (multiplierOf7.test(i)) return WHIZZ;

        return String.valueOf(i);
    }

    private static class ContainsPredictor implements Predicate<Integer> {
        final private String base;

        private ContainsPredictor(final Integer base) {
            this.base = String.valueOf(base);
        }

        @Override
        public boolean test(final Integer input) {
            return String.valueOf(input).contains(this.base);
        }
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
