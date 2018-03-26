package com.senlatask.task1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        try {
            System.out.println("Введите верхнюю границу диапазона вычислени простых чисел.(max 2147483647)");
            int limit = Integer.parseInt(reader.readLine());
            PrimeNumbers.findPrimeNumbers(limit);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
