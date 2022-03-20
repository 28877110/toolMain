package org.flyfish.algorithm;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

class AsFarFromLandAsPossibleTest {
    @Test
    void testMaxDistance() {
        assertEquals(-1, (new AsFarFromLandAsPossible()).maxDistance(new int[][]{new int[]{1, 1, 1, 1}}));
        assertEquals(-1,
                (new AsFarFromLandAsPossible()).maxDistance(new int[][]{new int[]{1, 1, 1, 1}, new int[]{1, 1, 1, 1}}));
        assertEquals(1,
                (new AsFarFromLandAsPossible()).maxDistance(new int[][]{new int[]{123, 1, 1, 1}, new int[]{1, 1, 1, 1}}));
    }

    @Test
    @Disabled("TODO: This test is incomplete")
    void testMaxDistance2() {
        // TODO: This test is incomplete.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.ArrayIndexOutOfBoundsException: 4
        //       at org.flyfish.algorithm.AsFarFromLandAsPossible.maxDistance(AsFarFromLandAsPossible.java:34)
        //   In order to prevent maxDistance(int[][])
        //   from throwing ArrayIndexOutOfBoundsException, add constructors or factory
        //   methods that make it easier to construct fully initialized objects used in
        //   maxDistance(int[][]).
        //   See https://diff.blue/R013 to resolve this issue.

        (new AsFarFromLandAsPossible()).maxDistance(new int[][]{new int[]{1, 1, 1, 1, 1, 1, 1, 1}, new int[]{1, 1, 1, 1}});
    }
}

