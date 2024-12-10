package ctci.sorting;

import ctci.util.Util;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class BubbleSortTest {
    @Test
    public void sortTest() {
        var input = Util.randIntegerArray(10, 100);
        var expected = Arrays.copyOf(input, input.length);
        Arrays.sort(expected);
        BubbleSort.sort(input);
        Assertions.assertArrayEquals(input, expected);
    }
}
