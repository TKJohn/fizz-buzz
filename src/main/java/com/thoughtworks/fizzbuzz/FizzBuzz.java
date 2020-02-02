package com.thoughtworks.fizzbuzz;

public class FizzBuzz {
    public static String fizzBuzz(final Integer input) {
        if (input % 3 == 0) return "Fizz";
        if (input % 5 == 0) return "Buzz";
        if (input % 7 == 0) return "Whizz";
        return String.valueOf(input);
    }
}
