package org.flyfish.algorithm;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class AddDigitsTest {
    @Test
    void testAddDigits() {
        assertEquals(1, (new AddDigits()).addDigits(10));
        assertEquals(0, (new AddDigits()).addDigits(0));
    }
}

