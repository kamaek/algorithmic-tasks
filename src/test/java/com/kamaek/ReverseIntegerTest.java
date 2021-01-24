package com.kamaek;

import org.junit.jupiter.api.Test;

import static com.kamaek.ReverseInteger.reverse;
import static org.junit.jupiter.api.Assertions.assertEquals;

class ReverseIntegerTest {

    @Test
    void reverseNegative() {
        assertEquals(-321, reverse(-123));
    }
}