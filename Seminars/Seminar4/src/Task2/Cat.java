package Task2;

public class Cat extends Animal {

    private int age;

    @Override
    public String toString() {
        return String.format("Котейка %s, возрастом %d", super.getName(), age);
    }

    public Cat(String name, int age) {
        super(name);
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

}
