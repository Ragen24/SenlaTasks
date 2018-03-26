package com.senlatask.task3;

public abstract class Intersection {
    public static void isIntersect(Point A1, Point B1, Point A2, Point B2) {
        double ua, ub, numeratorA, numeratorB, denominator;
        // Находим определитель
        denominator = (B2.y - A2.y) * (A1.x - B1.x) - (B2.x - A2.x) * (A1.y - B1.y);

        // В первом случае отрезки паралельны друг другу или лежат на одной прямой. Проверяем лежит ли вершина одного
        // отрезка на другом. Если да, то отрезки пересекаются, иначе нет.
        // Во втором случа решаем по правилу Крамера.
        if (denominator == 0){
            if ((A1.x * B1.y - B1.x * A1.y) * (B2.x - A2.x) - (A2.x * B2.y - B2.x * A2.y) * (B1.x - A1.x) == 0 &&
                    (A1.x * B1.y - B1.x * A1.y) * (B2.y - A2.y) - (A2.x * B2.y - B2.x * A2.y) * (B1.y - A1.y) == 0) {
                System.out.print("Отрезки пересекаются");
            } else System.out.print("Отрезки не пересекаются");
        } else {
            numeratorA = (B2.x - B1.x) * (B2.y - A2.y) - (B2.x - A2.x) * (B2.y - B1.y);
            numeratorB = (A1.x - B1.x) * (B2.y - B1.y) - (B2.x - B1.x) * (A1.y - B1.y);
            ua = numeratorA / denominator;
            ub = numeratorB / denominator;
            if (ua >= 0 && ua <= 1 && ub >= 0 && ub <= 1)   System.out.print("Отрезки пересекаются");
            else    System.out.print("Отрезки не пересекаются");
        }
    }
}
