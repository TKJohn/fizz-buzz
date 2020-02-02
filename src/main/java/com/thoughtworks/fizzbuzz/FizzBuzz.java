package com.thoughtworks.fizzbuzz;

public class FizzBuzz {
    public static String fizzBuzz(final Integer input) {
        if (contains3(input)) return "Fizz";

        if (isMultiplierOf3(input) && isMultiplierOf5(input) && isMultiplierOf7(input)) return "FizzBuzzWhizz";

        if (isMultiplierOf3(input) && isMultiplierOf5(input)) return "FizzBuzz";
        if (isMultiplierOf3(input) && isMultiplierOf7(input)) return "FizzWhizz";
        if (isMultiplierOf5(input) && isMultiplierOf7(input)) return "BuzzWhizz";

        if (isMultiplierOf3(input)) return "Fizz";
        if (isMultiplierOf5(input)) return "Buzz";
        if (isMultiplierOf7(input)) return "Whizz";

        return String.valueOf(input);
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
