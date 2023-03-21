package HW.model;

public class CatBuilder extends AnimalBuilder{
    @Override
    void buildType() {
        this.animal.setTypeAnimals(Type.CAT);
    }

    @Override
    void buildName(String name) {
        animal.setName(name);
    }

    @Override
    void buildAge(int age) {
        animal.setAge(age);
    }

    @Override
    void buildWeight(double weight) {
        animal.setWeight(weight);
    }

    @Override
    void buildColor(String color) {
        animal.setColor(color);
    }
}
