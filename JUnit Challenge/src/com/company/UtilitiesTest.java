package com.company;

import org.junit.jupiter.api.Assertions;

import static org.junit.jupiter.api.Assertions.*;

class UtilitiesTest {

    private Utilities util;

    @org.junit.jupiter.api.BeforeEach
    void setup() {
        util = new Utilities();
    }

    @org.junit.jupiter.api.Test
    void everyNthChar() {
        char[] output = util.everyNthChar(new char[] {'h', 'e', 'l', 'l', 'o'}, 2);
        assertArrayEquals(new char[] {'e', 'l'}, output);
        char[] output2 = util.everyNthChar(new char[] {'h', 'e', 'l', 'l', 'o'}, 8);
        assertArrayEquals(new char[] {'h', 'e', 'l', 'l', 'o'}, output2);
    }

    @org.junit.jupiter.api.Test
    void removePairs() {
        assertEquals("ABCDEF", util.removePairs("AABCDDEFF"));
        assertEquals("ABCABDEF", util.removePairs("ABCCABDEEF"));
        assertNull(null, util.removePairs(null));
        assertEquals("A", util.removePairs("A"));
        assertEquals("", util.removePairs(""));
    }

    @org.junit.jupiter.api.Test
    void converter() {
        assertEquals(300, util.converter(10, 5));
    }

    @org.junit.jupiter.api.Test
    void converter_arithmeticException() {
        Assertions.assertThrows(ArithmeticException.class, () -> {

        });

        util.converter(10, 0);

    }

    @org.junit.jupiter.api.Test
    void nullIfOddLength() {
        assertNull(util.nullIfOddLength("odd"));
        assertNotNull(util.nullIfOddLength("even"));
    }
}