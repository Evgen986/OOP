package task2;

public class Cat extends Animal{
    private String name;
    private int age;
    private int weigth;
    private String breed;
    private String oven;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getWeigth() {
        return weigth;
    }

    public void setWeigth(int weigth) {
        this.weigth = weigth;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getOven() {
        return oven;
    }

    public void setOven(String oven) {
        this.oven = oven;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", weigth=" + weigth +
                ", breed='" + breed + '\'' +
                ", oven='" + oven + '\'' +
                '}';
    }
}
