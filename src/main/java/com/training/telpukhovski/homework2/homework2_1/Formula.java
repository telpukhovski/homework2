package com.training.telpukhovski.homework2.homework2_1;

import java.util.Objects;

public class Formula {
    private FormulaData formulaData;

    public Formula(FormulaData formulaData) {
        this.formulaData = formulaData;
    }

    public FormulaData getFormulaData() {
        return formulaData;
    }

    public void setFormulaData(FormulaData formulaData) {
        this.formulaData = formulaData;
    }

    public double getResult() {
        return 4 * Math.pow(Math.PI, 2) * (Math.pow(formulaData.getA(), 3) / (Math.pow(formulaData.getP(), 2) * (formulaData.getM1() + formulaData.getM2())));
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Formula formula = (Formula) o;
        return Objects.equals(formulaData, formula.formulaData);
    }

    @Override
    public int hashCode() {
        return Objects.hash(formulaData);
    }

    @Override
    public String toString() {
        return "Formula{" +
                "formulaData=" + formulaData +
                '}';
    }
}
