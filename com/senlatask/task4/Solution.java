package com.senlatask.task4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        try {
            System.out.println("Введите два числа для нахождение НОД и НОК.");
            System.out.print("a: ");
            long a = Long.parseLong(reader.readLine());
            System.out.print("b: ");
            long b = Long.parseLong(reader.readLine());

            System.out.println("Для чисел " + a + " и " + b);
            System.out.println("НОД = " + findGCD(a, b));
            System.out.println("НОК = " + findLCM(a, b));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Находи НОД
    private static long findGCD(long a, long b) {
        if (b == 0)
            return Math.abs(a);
        return findGCD(b, a % b);
    }

    // Находим НОК
    private static long findLCM(long a,long b){
        return a / findGCD(a, b) * b;
    }
}
