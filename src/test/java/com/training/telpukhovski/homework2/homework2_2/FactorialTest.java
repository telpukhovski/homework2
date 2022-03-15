package com.training.telpukhovski.homework2.homework2_2;

import org.junit.Assert;
import org.junit.Test;

public class FactorialTest {
    public FactorialTest() {
    }

    @Test
    public void testChooseLoopType() {
        int expected1 = Factorial.chooseLoopType(1, 4);
        int expected2 = Factorial.chooseLoopType(2, 4);
        int expected3 = Factorial.chooseLoopType(3, 4);
        Assert.assertEquals((long)expected1, 24L);
        Assert.assertEquals((long)expected2, 24L);
        Assert.assertEquals((long)expected3, 24L);
    }
}
