package org.flyfish.algorithm;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

import org.junit.jupiter.api.Test;

class CompressStringLcciTest {
    @Test
    void testCompressString() {
        assertEquals("foo", (new CompressStringLcci()).compressString("foo"));
        assertNull((new CompressStringLcci()).compressString(null));
        assertEquals("", (new CompressStringLcci()).compressString(""));
    }
}

