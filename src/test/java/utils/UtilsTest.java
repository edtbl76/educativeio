package utils;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static utils.Utils.*;

class UtilsTest {

    @Test
    // This covers three branches TT, TF, FT
    void testLeftTrim() {
        String result = leftTrim("    string");
        assertEquals("string", result);
    }

    // This covers the case where the method never enters the while loop.
    @Test
    void testLeftTrimEmpty() {
        assertEquals("", leftTrim(""));
    }

    @Test
    void testRightTrim() {
        String result = rightTrim("string    ");
        assertEquals("string", result);
    }

    @Test
    void testRightTrimEmtpy() {
        assertEquals("", rightTrim(""));
    }

    @Test
    void testSwap() {
        int[] array = new int[]{1, 4, 3, 2, 5};
        int[] expected = new int[]{1, 2, 3, 4, 5};
        swap(array, 1, 3);
        assertArrayEquals(array, expected);

    }
}
