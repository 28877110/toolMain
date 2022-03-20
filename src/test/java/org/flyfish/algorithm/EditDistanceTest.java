package org.flyfish.algorithm;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class EditDistanceTest {
    @Test
    void testMinDistance() {
        assertEquals(1, (new EditDistance()).minDistance("Word1", "Word2"));
    }
}

