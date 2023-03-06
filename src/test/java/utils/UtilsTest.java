package utils;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class UtilsTest {

    @Test
    // This covers three branches TT, TF, FT
    void testLeftTrim() {
        String result = Utils.leftTrim("    string");
        assertEquals("string", result);
    }

    // This covers the case where the method never enters the while loop.
    @Test
    void testLeftTrimEmpty() {
        assertEquals("", Utils.leftTrim(""));
    }

    @Test
    void testRightTrim() {
        String result = Utils.rightTrim("string    ");
        assertEquals("string", result);
    }

    @Test
    void testRightTrimEmtpy() {
        assertEquals("", Utils.rightTrim(""));
    }
}

//Generated with love by TestMe :) Please report issues and submit feature requests at: http://weirddev.com/forum#!/testme