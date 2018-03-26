package com.senlatask.task2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

import static com.senlatask.task2.Fibonacci.*;

public class Solution {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.println("Введите до какого числа вывести последовательность Фибоначчи.");
            int limit = Integer.parseInt(reader.readLine());

            // Матричный метод помимо i-го числа считает последующее и предыдушее. По этому считаем с шагом в 3
            // и забираем из матрицы сразу 3 числа
            int i = 1;
            while (true) {
                BigInteger[][] temp = pow(ONE, i);
                System.out.println(i + ": " + temp[0][0]);
                if (i++ == limit) break;
                System.out.println(i + ": " + temp[0][1]);
                if (i++ == limit) break;
                System.out.println(i + ": " + temp[1][1]);
                if (i++ == limit) break;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
