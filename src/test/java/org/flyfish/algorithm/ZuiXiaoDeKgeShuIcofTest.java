package org.flyfish.algorithm;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

class ZuiXiaoDeKgeShuIcofTest {
    @Test
    void testGetLeastNumbers() {
        int[] actualLeastNumbers = (new ZuiXiaoDeKgeShuIcof()).getLeastNumbers(new int[]{1, 1, 1, 1}, 1);
        assertEquals(1, actualLeastNumbers.length);
        assertEquals(1, actualLeastNumbers[0]);
    }

    @Test
    void testGetLeastNumbers2() {
        int[] actualLeastNumbers = (new ZuiXiaoDeKgeShuIcof()).getLeastNumbers(new int[]{4, 1, 1, 1}, 1);
        assertEquals(1, actualLeastNumbers.length);
        assertEquals(1, actualLeastNumbers[0]);
    }

    @Test
    @Disabled("TODO: This test is incomplete")
    void testGetLeastNumbers3() {
        // TODO: This test is incomplete.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.ArrayIndexOutOfBoundsException: 0
        //       at org.flyfish.algorithm.ZuiXiaoDeKgeShuIcof.getLeastNumbers(ZuiXiaoDeKgeShuIcof.java:32)
        //   In order to prevent getLeastNumbers(int[], int)
        //   from throwing ArrayIndexOutOfBoundsException, add constructors or factory
        //   methods that make it easier to construct fully initialized objects used in
        //   getLeastNumbers(int[], int).
        //   See https://diff.blue/R013 to resolve this issue.

        (new ZuiXiaoDeKgeShuIcof()).getLeastNumbers(new int[]{}, 1);
    }

    @Test
    void testGetLeastNumbers4() {
        int[] actualLeastNumbers = (new ZuiXiaoDeKgeShuIcof()).getLeastNumbers(new int[]{1, 1, 1, 1}, 4);
        assertEquals(4, actualLeastNumbers.length);
        assertEquals(1, actualLeastNumbers[0]);
        assertEquals(1, actualLeastNumbers[1]);
        assertEquals(1, actualLeastNumbers[2]);
        assertEquals(1, actualLeastNumbers[3]);
    }

    @Test
    void testGetLeastNumbers5() {
        assertEquals(0, (new ZuiXiaoDeKgeShuIcof()).getLeastNumbers(new int[]{1, 1, 1, 1}, 0).length);
    }

    @Test
    void testGetLeastNumbers6() {
        assertThrows(NegativeArraySizeException.class,
                () -> (new ZuiXiaoDeKgeShuIcof()).getLeastNumbers(new int[]{1, 1, 1, 1}, -1));
    }

    @Test
    void testGetLeastNumbers7() {
        int[] actualLeastNumbers = (new ZuiXiaoDeKgeShuIcof()).getLeastNumbers(new int[]{4, 1, 1, 1}, 2);
        assertEquals(2, actualLeastNumbers.length);
        assertEquals(1, actualLeastNumbers[0]);
        assertEquals(1, actualLeastNumbers[1]);
    }

    @Test
    void testGetLeastNumbers8() {
        int[] actualLeastNumbers = (new ZuiXiaoDeKgeShuIcof()).getLeastNumbers(new int[]{4, 1, 1, 1}, 3);
        assertEquals(3, actualLeastNumbers.length);
        assertEquals(1, actualLeastNumbers[0]);
        assertEquals(1, actualLeastNumbers[1]);
        assertEquals(1, actualLeastNumbers[2]);
    }
}

