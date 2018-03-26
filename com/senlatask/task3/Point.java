package com.senlatask.task3;

class Point {
    public double x;
    public double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public Point substruct(Point p) {
        return new Point(this.x - p.x, this.y - y);
    }
}