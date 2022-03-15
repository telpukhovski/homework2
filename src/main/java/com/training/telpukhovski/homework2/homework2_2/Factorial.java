package com.training.telpukhovski.homework2.homework2_2;

public class Factorial {
    public Factorial() {
    }

    public static int factorialFor(int x) {
        int result = 1;
        for (int i = 1; i <= x; i++) {
            result *= i;
        }
        return result;
    }

    public static int factorialWhile(int x) {
        int i = 1;
        int result = 1;
        while (i < x) {
            i++;
            result *= i;
        }
        return result;
    }

    public static int factorialDoWhile(int x) {
        int i = 1;
        int result = 1;
        do {
            i++;
            result *= i;
        }
        while (i < x);
        return result;
    }

    public static int chooseLoopType(int loopType, int n) {
        int result;
        switch (loopType) {
            case 1:
                result = factorialFor(n);
                break;
            case 2:
                result = factorialWhile(n);
                break;
            case 3:
                result = factorialDoWhile(n);
                break;

            default:
                throw new IllegalStateException("Unexpected value of loopType: " + loopType);
        }
        return result;
    }
}
