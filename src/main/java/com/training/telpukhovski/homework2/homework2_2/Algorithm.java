package com.training.telpukhovski.homework2.homework2_2;

import java.util.Arrays;

public class Algorithm {
    private Algorithm() {
    }

    public static String chooseAlgorithm(int algorithmId, int loopType, int n) {
        String result;
        switch (algorithmId) {
            case 1:
                result = Arrays.toString(Fibonacci.chooseLoopType(loopType, n));
                break;
            case 2:
                result = String.valueOf(Factorial.chooseLoopType(loopType, n));
                break;
            default:
                throw new IllegalStateException("Unexpected value of algorithm: " + algorithmId);
        }
        return result;
    }
}
