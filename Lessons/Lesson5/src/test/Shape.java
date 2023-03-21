package test;

import java.util.ArrayList;
import java.util.List;

public class Shape {
    private double area;
    private String name;

    public Shape(double area, String name) {
        this.area = area;
        this.name = name;
    }

    public double getArea() {
        return area;
    }

    public String getName() {
        return name;
    }
    List<Shape> shapes = new ArrayList<Shape>();
    public void print(StringBuilder sb, String intend){
        sb.append(String.format("%s %s %s\n", intend, name, getArea()));

        for(Shape shape:shapes){
            shape.print(sb, intend + " ");
        }
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        print(sb, "");
        return sb.toString();
    }
}
