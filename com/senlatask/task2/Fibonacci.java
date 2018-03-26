package com.senlatask.task2;

import java.math.BigInteger;

// Вычисление чисел фибоначи матричным способом
public abstract class Fibonacci {

    // Вспомогательная матрица
    public final static BigInteger[][] ONE = {{BigInteger.ZERO, BigInteger.ONE}, {BigInteger.ONE, BigInteger.ONE}};

    // Перемножаем матрицы
    public static BigInteger[][] mul(BigInteger[][] a, BigInteger[][] b) {
        BigInteger[][] res = {
                {a[0][0].multiply(b[0][0]).add(a[0][1].multiply(b[1][0])), a[0][0].multiply(b[0][1]).add(a[0][1].multiply(b[1][1]))},
                {a[1][0].multiply(b[0][0]).add(a[1][1].multiply(b[1][0])), a[1][0].multiply(b[0][1]).add(a[1][1].multiply(b[1][1]))}
        };
        return res;
    }
    // Рекурсивно находим матрицу вида |Fn-1 Fn| откуда получаем значение чисел Фибоначчи
    //                                 |Fn Fn+1|
    public static BigInteger[][] pow(BigInteger[][] a, int k) {
        if (k == 0) return ONE;
        if (k == 1) return a;
        if (k == 2) return mul(a, a);
        if (k % 2 == 1) return mul(ONE, pow(a, k - 1));
        return pow(pow(a, k / 2), 2);
    }
}
