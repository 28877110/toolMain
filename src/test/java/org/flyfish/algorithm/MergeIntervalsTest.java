package org.flyfish.algorithm;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

class MergeIntervalsTest {
    @Test
    void testMerge() {
        assertEquals(1, (new MergeIntervals()).merge(new int[][]{new int[]{42, 42, 42, 42}}).length);
        assertEquals(2, (new MergeIntervals()).merge(new int[][]{new int[]{42, 1, 42, 42}}).length);
        assertEquals(0, (new MergeIntervals()).merge(new int[][]{}).length);
        assertEquals(1,
                (new MergeIntervals()).merge(new int[][]{new int[]{42, 42, 42, 42}, new int[]{42, 42, 42, 42}}).length);
    }

    @Test
    @Disabled("TODO: This test is incomplete")
    void testMerge2() {
        // TODO: This test is incomplete.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.ArrayIndexOutOfBoundsException: 0
        //       at org.flyfish.algorithm.MergeIntervals.merge(MergeIntervals.java:32)
        //   In order to prevent merge(int[][])
        //   from throwing ArrayIndexOutOfBoundsException, add constructors or factory
        //   methods that make it easier to construct fully initialized objects used in
        //   merge(int[][]).
        //   See https://diff.blue/R013 to resolve this issue.

        (new MergeIntervals()).merge(new int[][]{new int[]{}});
    }

    @Test
    @Disabled("TODO: This test is incomplete")
    void testMerge3() {
        // TODO: This test is incomplete.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.ArrayIndexOutOfBoundsException: 0
        //       at org.flyfish.algorithm.MergeIntervals.lambda$merge$0(MergeIntervals.java:30)
        //       at java.util.Comparator.lambda$comparingInt$7b0bb60$1(Comparator.java:490)
        //       at java.util.TimSort.countRunAndMakeAscending(TimSort.java:355)
        //       at java.util.TimSort.sort(TimSort.java:220)
        //       at java.util.Arrays.sort(Arrays.java:1438)
        //       at org.flyfish.algorithm.MergeIntervals.merge(MergeIntervals.java:30)
        //   In order to prevent merge(int[][])
        //   from throwing ArrayIndexOutOfBoundsException, add constructors or factory
        //   methods that make it easier to construct fully initialized objects used in
        //   merge(int[][]).
        //   See https://diff.blue/R013 to resolve this issue.

        (new MergeIntervals()).merge(new int[][]{new int[]{}, new int[]{42, 42, 42, 42}});
    }
}

