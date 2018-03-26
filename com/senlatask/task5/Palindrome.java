package com.senlatask.task5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Palindrome {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            while (true) {
                System.out.println("Введите слово для проверки на полиндромность (для выхода введите 'exit'.");
                String sourceString = reader.readLine();
                if (sourceString.equalsIgnoreCase("exit")) break;
                // Сравниваем исходную строку с перевернутой
                boolean isPalindrom = sourceString.equalsIgnoreCase(new StringBuilder(sourceString).reverse().toString());
                if (isPalindrom)
                    System.out.println(sourceString + " - палиндром!\n");
                else
                    System.out.println(sourceString + " - не палиндром!\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
