package org.flyfish.algorithm;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

class FindWordsThatCanBeFormedByCharactersTest {
    @Test
    @Disabled("TODO: This test is incomplete")
    void testCountCharacters() {
        // TODO: This test is incomplete.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.ArrayIndexOutOfBoundsException: -30
        //       at org.flyfish.algorithm.FindWordsThatCanBeFormedByCharacters.getLetter(FindWordsThatCanBeFormedByCharacters.java:43)
        //       at org.flyfish.algorithm.FindWordsThatCanBeFormedByCharacters.countCharacters(FindWordsThatCanBeFormedByCharacters.java:29)
        //   In order to prevent countCharacters(String[], String)
        //   from throwing ArrayIndexOutOfBoundsException, add constructors or factory
        //   methods that make it easier to construct fully initialized objects used in
        //   countCharacters(String[], String).
        //   See https://diff.blue/R013 to resolve this issue.

        (new FindWordsThatCanBeFormedByCharacters()).countCharacters(new String[]{"Words"}, "Chars");
    }

    @Test
    @Disabled("TODO: This test is incomplete")
    void testCountCharacters2() {
        // TODO: This test is incomplete.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.ArrayIndexOutOfBoundsException: -10
        //       at org.flyfish.algorithm.FindWordsThatCanBeFormedByCharacters.getLetter(FindWordsThatCanBeFormedByCharacters.java:43)
        //       at org.flyfish.algorithm.FindWordsThatCanBeFormedByCharacters.countCharacters(FindWordsThatCanBeFormedByCharacters.java:31)
        //   In order to prevent countCharacters(String[], String)
        //   from throwing ArrayIndexOutOfBoundsException, add constructors or factory
        //   methods that make it easier to construct fully initialized objects used in
        //   countCharacters(String[], String).
        //   See https://diff.blue/R013 to resolve this issue.

        (new FindWordsThatCanBeFormedByCharacters()).countCharacters(new String[]{"Words"}, "");
    }

    @Test
    void testCountCharacters3() {
        assertEquals(0, (new FindWordsThatCanBeFormedByCharacters()).countCharacters(new String[]{""}, ""));
    }
}

