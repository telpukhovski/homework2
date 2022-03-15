package com.training.telpukhovski.homework2.homework2_2;

import org.junit.Assert;
import org.junit.Test;

public class FibonacciTest {
    public FibonacciTest() {
    }

    @Test
    public void testChooseLoopType() {
        int[] expected1 = Fibonacci.chooseLoopType(1, 4);
        int[] expected2 = Fibonacci.chooseLoopType(2, 4);
        int[] expected3 = Fibonacci.chooseLoopType(3, 4);
        int[] actual = new int[]{0, 1, 1, 2};
        Assert.assertArrayEquals(expected1, actual);
        Assert.assertArrayEquals(expected2, actual);
        Assert.assertArrayEquals(expected3, actual);
    }
}
