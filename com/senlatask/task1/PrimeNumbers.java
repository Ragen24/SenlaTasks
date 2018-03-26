package com.senlatask.task1;

public abstract class PrimeNumbers {
    public static void findPrimeNumbers(int limit) {
        // Создаем и инициализируем массив
        boolean[] isPrime = new boolean[limit + 1];
        for (int i = 2; i <= limit; i++) {
            isPrime[i] = true;
        }

        // Вычеркиваем не простые числа используя решето Эратосфена
        for (int factor = 2; factor * factor <= limit; factor++) {
            if (isPrime[factor]) {
                for (int j = factor; factor * j <= limit; j++) {
                    isPrime[factor*j] = false;
                }
            }
        }
        // Выводим простые числа в консоль
        int q = 0;
        for (int i = 2; i <= limit; i++) {
            if (isPrime[i]) {
                System.out.printf(i + "  ");
                q++;
                if (q % 10 == 0)
                    System.out.println();
            }
        }
    }
}
