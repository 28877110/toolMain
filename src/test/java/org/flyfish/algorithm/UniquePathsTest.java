package org.flyfish.algorithm;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

class UniquePathsTest {
    @Test
    void testUniquePaths() {
        assertEquals(1, (new UniquePaths()).uniquePaths(1, 1));
        assertEquals(1, (new UniquePaths()).uniquePaths(3, 1));
        assertThrows(NegativeArraySizeException.class, () -> (new UniquePaths()).uniquePaths(-1, 1));
        assertEquals(6, (new UniquePaths()).uniquePaths(3, 3));
    }

    @Test
    @Disabled("TODO: This test is incomplete")
    void testUniquePaths2() {
        // TODO: This test is incomplete.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.ArrayIndexOutOfBoundsException: 0
        //       at org.flyfish.algorithm.UniquePaths.uniquePaths(UniquePaths.java:26)
        //   In order to prevent uniquePaths(int, int)
        //   from throwing ArrayIndexOutOfBoundsException, add constructors or factory
        //   methods that make it easier to construct fully initialized objects used in
        //   uniquePaths(int, int).
        //   See https://diff.blue/R013 to resolve this issue.

        (new UniquePaths()).uniquePaths(0, 1);
    }

    @Test
    @Disabled("TODO: This test is incomplete")
    void testUniquePaths3() {
        // TODO: This test is incomplete.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.ArrayIndexOutOfBoundsException: 0
        //       at org.flyfish.algorithm.UniquePaths.uniquePaths(UniquePaths.java:26)
        //   In order to prevent uniquePaths(int, int)
        //   from throwing ArrayIndexOutOfBoundsException, add constructors or factory
        //   methods that make it easier to construct fully initialized objects used in
        //   uniquePaths(int, int).
        //   See https://diff.blue/R013 to resolve this issue.

        (new UniquePaths()).uniquePaths(1, 0);
    }
}

