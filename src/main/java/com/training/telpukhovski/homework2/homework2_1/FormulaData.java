package com.training.telpukhovski.homework2.homework2_1;

import java.util.Objects;

public class FormulaData {
    private int a;
    private int p;
    private double m1;
    private double m2;

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getP() {
        return p;
    }

    public void setP(int p) {
        this.p = p;
    }

    public double getM1() {
        return m1;
    }

    public void setM1(double m1) {
        this.m1 = m1;
    }

    public double getM2() {
        return m2;
    }

    public void setM2(double m2) {
        this.m2 = m2;
    }

    public FormulaData(String[] args) {
        a = Integer.parseInt(args[0]);
        p = Integer.parseInt(args[1]);
        m1 = Double.parseDouble(args[2]);
        m2 = Double.parseDouble(args[3]);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FormulaData that = (FormulaData) o;
        return a == that.a && p == that.p && Double.compare(that.m1, m1) == 0 && Double.compare(that.m2, m2) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(a, p, m1, m2);
    }

    @Override
    public String toString() {
        return "FormulaData{" +
                "a=" + a +
                ", p=" + p +
                ", m1=" + m1 +
                ", m2=" + m2 +
                '}';
    }
}
