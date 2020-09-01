package com.company;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class UtilitiesTestParameterized {

//    private Utilities util;
//
//    private String input;
//    private String output;
//
//    public UtilitiesTestParameterized(String input, String output) {
//        this.input = input;
//        this.output = output;
//    }

//    @org.junit.jupiter.api.BeforeEach
//    void setup() {
//        util = new Utilities();
//    }

    @ParameterizedTest
    @MethodSource("testConditions")
    void removePairs(Utilities util, String input, String output) {
        Assertions.assertEquals(output, util.removePairs(input));
    }

    private static Stream<Arguments> testConditions() {
        return Stream.of(
                Arguments.of(new Utilities(), "ABCDEF", "ABCDEFF"),
                Arguments.of(new Utilities(), "AB8EFG", "AB88EFFG"),
                Arguments.of(new Utilities(), "123456", "112233445566"),
                Arguments.of(new Utilities(), "A", "A")
        );
    }

}
