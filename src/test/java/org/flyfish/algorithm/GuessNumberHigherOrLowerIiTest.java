package org.flyfish.algorithm;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class GuessNumberHigherOrLowerIiTest {
    @Test
    void testGetMoneyAmount() {
        assertEquals(0, (new GuessNumberHigherOrLowerIi()).getMoneyAmount(1));
        assertEquals(0, (new GuessNumberHigherOrLowerIi()).getMoneyAmount(0));
    }
}

