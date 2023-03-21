package cw02;

public class DogBuilder {
    public static DogBuilder instance = null;
    Dog obj;

    public DogBuilder() {

    }

    public static DogBuilder getInstance() {
        if (instance == null)
            instance = new DogBuilder();
        instance.obj = new Dog();

        return instance;
    }
    public DogBuilder setName(String name) {
        obj.setName(name);
        return this;
    }
    public DogBuilder setBreed(String breed) {
        obj.setBreed(breed);
        return this;
    }
    public DogBuilder setOwner(String owner) {
        obj.setOwner(owner);
        return this;
    }
    public DogBuilder setAge(int age) {
        obj.setAge(age);
        return this;
    }
    public DogBuilder setWeight(int weight) {
        obj.setAge(weight);
        return this;
    }
    public DogBuilder setHeight(int height) {
        obj.setAge(height);
        return this;
    }
    public DogBuilder setDate(long date) {
        obj.setDate(date);
        return this;
    }
    public Dog build() {
        return obj;
    }
}
