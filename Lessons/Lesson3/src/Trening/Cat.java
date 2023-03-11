package Trening;

import java.util.Comparator;

public class Cat extends Animal implements Comparable<Cat>{
    private String color;
    public Cat(String name, int weight, String color) {
        super(name, weight);
        this.color = color;
    }

    @Override
    public String toString() {
        StringBuffer result = new StringBuffer();
        result.append("Окрас = ").append(color).append("; ");
        return super.toString() + result;
    }

    public String getColor() {
        return color;
    }

    @Override
    public int compareTo(Cat cat) {
        return Integer.compare(getWeight(), cat.getWeight());
    }
}
