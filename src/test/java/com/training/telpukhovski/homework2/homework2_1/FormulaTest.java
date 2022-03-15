package com.training.telpukhovski.homework2.homework2_1;

import org.junit.Assert;
import org.junit.Test;

public class FormulaTest {
    public FormulaTest() {
    }

    @Test
    public void TestGetResult() {
        FormulaData formulaData = new FormulaData(new String[]{"3", "5", "1.5", "0.5"});
        Formula formula = new Formula(formulaData);
        double expected = formula.getResult();
        double actual = 21.3183455D;
        Assert.assertEquals(expected, actual, 0.00000001);
    }
}
