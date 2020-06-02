package com.thoughtworks.fizzbuzz;

public class FizzBuzz {

    private static final String FIZZ = "Fizz";
    private static final String BUZZ = "Buzz";
    private static final String WHIZZ = "Whizz";
    private static final String FIZZ_BUZZ = "FizzBuzz";
    private static final String FIZZ_WHIZZ = "FizzWhizz";
    private static final String BUZZ_WHIZZ = "BuzzWhizz";
    private static final String FIZZ_BUZZ_WHIZZ = "FizzBuzzWhizz";

    public static String fizzBuzz(final Integer input) {
        if (contains7(input)) return handleContains7(input);
        if (contains5(input)) return handleContains5(input);
        if (contains3(input)) return handleContains3();

        return handleNoContains(input);
    }

    private static String handleNoContains(final Integer input) {
        if (isMultiplierOf3(input) && isMultiplierOf5(input) && isMultiplierOf7(input))
            return FIZZ_BUZZ_WHIZZ;

        if (isMultiplierOf3(input) && isMultiplierOf5(input)) return FIZZ_BUZZ;
        if (isMultiplierOf3(input) && isMultiplierOf7(input)) return FIZZ_WHIZZ;
        if (isMultiplierOf5(input) && isMultiplierOf7(input)) return BUZZ_WHIZZ;

        if (isMultiplierOf3(input)) return FIZZ;
        if (isMultiplierOf5(input)) return BUZZ;
        if (isMultiplierOf7(input)) return WHIZZ;
        return String.valueOf(input);
    }

    private static String handleContains3() {
        return FIZZ;
    }

    private static String handleContains5(final Integer input) {
        if (isMultiplierOf5(input) && isMultiplierOf7(input)) return BUZZ_WHIZZ;

        if (isMultiplierOf5(input)) return BUZZ;
        if (isMultiplierOf7(input)) return WHIZZ;
        return String.valueOf(input);
    }

    private static String handleContains7(final Integer input) {
        if (contains3(input)) return handleContains3();

        if (isMultiplierOf3(input) && isMultiplierOf7(input)) return FIZZ_WHIZZ;

        if (isMultiplierOf3(input)) return FIZZ;
        if (isMultiplierOf7(input)) return WHIZZ;

        return String.valueOf(input);
    }

    private static boolean contains7(final Integer input) {
        return String.valueOf(input).contains("7");
    }

    private static boolean contains5(final Integer input) {
        return String.valueOf(input).contains("5");
    }

    private static boolean contains3(final Integer input) {
        return String.valueOf(input).contains("3");
    }

    private static boolean isMultiplierOf7(final Integer input) {
        return input % 7 == 0;
    }

    private static boolean isMultiplierOf5(final Integer input) {
        return input % 5 == 0;
    }

    private static boolean isMultiplierOf3(final Integer input) {
        return input % 3 == 0;
    }
}
