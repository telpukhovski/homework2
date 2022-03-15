package com.training.telpukhovski.homework2.homework2_2;

public class Fibonacci {
    private Fibonacci() {
    }

    public static int[] fibonacciWhile(int array) {
        int[] fibonacci = new int[array];
        fibonacci[0] = 0;
        fibonacci[1] = 1;
        int i = 2;
        while (i < array) {
            fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];
            i++;
        }
        return fibonacci;

    }

    public static int[] fibonacciDoWhile(int array) {
        int[] fibonacci = new int[array];
        fibonacci[0] = 0;
        fibonacci[1] = 1;
        int i = 2;
        do {
            fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];
            i++;
        } while (i < array);
        return fibonacci;
    }

    public static int[] fibonacciFor(int array) {
        int[] fibonacci = new int[array];
        fibonacci[0] = 0;
        fibonacci[1] = 1;
        for (int i = 2; i < array; i++) {
            fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];
        }
        return fibonacci;
    }

    public static int[] chooseLoopType(int loopType, int n) {
        int[] result;
        switch (loopType) {
            case 1:
                result = fibonacciFor(n);
                break;

            case 2:

                result = fibonacciWhile(n);
                break;
            case 3:

                result = fibonacciDoWhile(n);
                break;
            default:
                throw new IllegalStateException("Unexpected value of loopType: " + loopType);
        }

        return result;
    }
}
