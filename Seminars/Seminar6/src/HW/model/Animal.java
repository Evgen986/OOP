package HW.model;

public class Animal {
    private Type typeAnimals;
    private String name;
    private int age;
    private double weight;
    private String color;

    public void setTypeAnimals(Type typeAnimals) {
        this.typeAnimals = typeAnimals;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "typeAnimals=" + typeAnimals +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", weight=" + weight +
                ", color='" + color + '\'' +
                '}';
    }
}
