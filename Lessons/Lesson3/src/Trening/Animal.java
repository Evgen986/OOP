package Trening;

public abstract class Animal {
    private String name;
    private int weight;

    @Override
    public String toString() {
        StringBuffer result = new StringBuffer();
        result.append("Имя = ").append(name).append("; ");
        result.append("Вес = ").append(weight).append("; ");
        return result.toString();
    }

    public String getName() {
        return name;
    }

    public int getWeight() {
        return weight;
    }

    public Animal(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }
}
