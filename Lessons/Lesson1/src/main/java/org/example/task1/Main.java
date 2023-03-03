package org.example.task1;

public class Main extends Point2D{
    public static double distance(double x1, double y1, double x2, double y2){
        return Math.sqrt(Math.pow(x1 - x2, 2)) + (Math.pow(y1 - y2, 2));
    }

    /**
     * Перегруженный метод
     * @param a экземпляр класса Point
     * @param b экземпляр класса Point
     * @return
     */
    public static double distance(Point2D a, Point2D b){
        return Math.sqrt(Math.pow(a.getX() - b.getX(), 2)) + (Math.pow(a.getY() - b.getY(), 2));
    }
    public static void main(String[] args) {
        Point2D a = new Point2D(0);
        Point2D b = new Point2D(2,0);

        System.out.println(a);
        System.out.println(b);

        System.out.println(distance(a,b));
    }
}
