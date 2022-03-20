package org.flyfish.algorithm;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class L132PatternTest {
    @Test
    void testFind132pattern() {
        assertFalse((new L132Pattern()).find132pattern(new int[]{1000, 1000, 1000, 1000}));
        assertFalse((new L132Pattern()).find132pattern(new int[]{10, 1000, 1000, 1000}));
        assertFalse((new L132Pattern()).find132pattern(new int[]{}));
        assertTrue((new L132Pattern()).find132pattern(new int[]{3, 1000, 10, 1000}));
    }
}

