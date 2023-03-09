package sort;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static sort.ArraySorts.*;

class ArraySortsTest {

    @Test
    void testRecursiveSwapSort() {
        int[] array = new int[]{5, 4, 3, 2, 1};
        int[] sorted = new int[]{1, 2, 3, 4, 5};
        recursiveSwapSort(array, array.length);
        assertArrayEquals(array, sorted);
    }
}
