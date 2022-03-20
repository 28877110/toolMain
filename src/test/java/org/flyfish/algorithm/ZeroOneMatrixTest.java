package org.flyfish.algorithm;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

class ZeroOneMatrixTest {
    @Test
    void testUpdateMatrix() {
        assertEquals(1, (new ZeroOneMatrix()).updateMatrix(new int[][]{new int[]{1, 1, 1, 1}}).length);
        assertEquals(1, (new ZeroOneMatrix()).updateMatrix(new int[][]{new int[]{0, 1, 1, 1}}).length);
        assertEquals(0, (new ZeroOneMatrix()).updateMatrix(new int[][]{}).length);
        assertEquals(2,
                (new ZeroOneMatrix()).updateMatrix(new int[][]{new int[]{1, 1, 1, 1}, new int[]{1, 1, 1, 1}}).length);
    }

    @Test
    @Disabled("TODO: This test is incomplete")
    void testUpdateMatrix2() {
        // TODO: This test is incomplete.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.ArrayIndexOutOfBoundsException: 4
        //       at org.flyfish.algorithm.ZeroOneMatrix.updateMatrix(ZeroOneMatrix.java:37)
        //   In order to prevent updateMatrix(int[][])
        //   from throwing ArrayIndexOutOfBoundsException, add constructors or factory
        //   methods that make it easier to construct fully initialized objects used in
        //   updateMatrix(int[][]).
        //   See https://diff.blue/R013 to resolve this issue.

        (new ZeroOneMatrix()).updateMatrix(new int[][]{new int[]{2, 2, 2, 2, 2, 2, 2, 2}, new int[]{1, 1, 1, 1}});
    }
}

