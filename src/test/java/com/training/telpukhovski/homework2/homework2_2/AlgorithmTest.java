package com.training.telpukhovski.homework2.homework2_2;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class AlgorithmTest {
    public AlgorithmTest() {
    }

    @Test
    public void testChooseAlgorithm() {
        String expected1 = Algorithm.chooseAlgorithm(1, 1, 4);
        String expected2 = Algorithm.chooseAlgorithm(2, 1, 4);
        String actual1 = Arrays.toString(new int[]{0, 1, 1, 2});
        String actual2 = String.valueOf(24);
        Assert.assertEquals(expected1, actual1);
        Assert.assertEquals(expected2, actual2);
    }
}
