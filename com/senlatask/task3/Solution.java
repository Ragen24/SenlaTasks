package com.senlatask.task3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Point A1, B1, A2, B2;
        double x, y;

        // Вводим координаты точек, в случае ошибки, ввод повторяется.
        while (true) {
            try {
                System.out.println("Введите координаты отрезков.");
                x = scan.nextDouble();
                y = scan.nextDouble();
                A1 = new Point(x, y);
                x = scan.nextDouble();
                y = scan.nextDouble();
                B1 = new Point(x, y);
                x = scan.nextDouble();
                y = scan.nextDouble();
                A2 = new Point(x, y);
                x = scan.nextDouble();
                y = scan.nextDouble();
                B2 = new Point(x, y);
                break;
            } catch (InputMismatchException e) {
                System.out.println("Введены неккоректные данные!\n");
                scan.next();
            }
        }
        // Определяем пересекаются ли отрезки.
        Intersection.isIntersect(A1, B1, A2, B2);
    }

}
