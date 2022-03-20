package org.flyfish.algorithm;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class TowKeysKeyboardTest {
    @Test
    void testMinSteps() {
        assertEquals(0, (new TowKeysKeyboard()).minSteps(1));
        assertEquals(2, (new TowKeysKeyboard()).minSteps(2));
    }
}

