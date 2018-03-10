package ru.job4j.condition;

/**
 * Класс вычисляет расстояние между двух точек в декартовой системе координат
 *
 * @author Alesksand Launbraun
 * @since 10.03.2018
 * @version 1.0
 */

public class Point {
    private int x;
    private int y;

    private Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
    /**
     * Method distanceTo - производит вычисление расстояния между двух точек
     * @param that - кординаты точки В
     */

    private double distanceTo(Point that) {
        return Math.sqrt(Math.pow(this.x - that.x, 2) + Math.pow(this.y - that.y, 2));
    }

    public static void main(String[] args) {
        Point a = new Point(0, 1);
        Point b = new Point(3, 5);
        System.out.println("x1 = " + a.x);
        System.out.println("y1 = " + a.y);
        System.out.println("x2 = " + b.x);
        System.out.println("y2 = " + b.y);
        double result = a.distanceTo(b);
        System.out.println("Расстояние между точками А и В : " + result);
    }
}