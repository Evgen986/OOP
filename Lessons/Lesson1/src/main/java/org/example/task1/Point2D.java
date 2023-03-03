package org.example.task1;

/**
 * Это точка 2D
 */
public class Point2D {

    /**
     * Поля класса
     */
    private double x, y;

    /**
     * Конструктор принимающий значение 2-х координат точки
     *
     * @param valueX координата x
     * @param valueY координата y
     */
    Point2D(int valueX, int valueY) {
        this.x = valueX;
        this.y = valueY;
    }

    /**
     * Конструктор принимающий одно значение и присваивающий его в координаты x и y
     *
     * @param value значение для присваивания x и y
     */
    Point2D(int value) {
        this(value, value);
    }

    /**
     * Конструктор без параметров, по умолчанию присваивает 0 в x и y
     */
    Point2D() {
        this(0);
    }

    public double getX() {
        return this.x;
    }

    public double getY() {
        return this.y;
    }

    @Override
    public String toString() {
        return String.format("x = %.2f; y = %.2f", x, y);
    }
}
