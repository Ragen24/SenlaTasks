package com.senlatask.task6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            String text = reader.readLine();
            // Удаляем цифры
            text = text.replaceAll("[0-9]", "");
            // Удаляем лишние пробелы
            text = text.replaceAll("[\\s]{2,}", " ").trim();
            System.out.println("\n" + text);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
