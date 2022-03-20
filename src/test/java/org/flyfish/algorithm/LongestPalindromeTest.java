package org.flyfish.algorithm;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

class LongestPalindromeTest {
    @Test
    void testLongestPalindrome() {
        assertEquals(3, (new LongestPalindrome()).longestPalindrome("foo"));
        assertEquals(0, (new LongestPalindrome()).longestPalindrome(""));
    }

    @Test
    @Disabled("TODO: This test is incomplete")
    void testLongestPalindrome2() {
        // TODO: This test is incomplete.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.ArrayIndexOutOfBoundsException: -13
        //       at org.flyfish.algorithm.LongestPalindrome.longestPalindrome(LongestPalindrome.java:26)
        //   In order to prevent longestPalindrome(String)
        //   from throwing ArrayIndexOutOfBoundsException, add constructors or factory
        //   methods that make it easier to construct fully initialized objects used in
        //   longestPalindrome(String).
        //   See https://diff.blue/R013 to resolve this issue.

        (new LongestPalindrome()).longestPalindrome("42");
    }
}

