package HW.model;

public class Director {
    AnimalBuilder builder;
    public void setBuilder(AnimalBuilder builder){
        this.builder = builder;
    }
    Animal buildAnimal(int choice, String name, int age, double weight, String color){
        builder.createAnimal(choice);
        builder.buildType();
        builder.buildName(name);
        builder.buildAge(age);
        builder.buildWeight(weight);
        builder.buildColor(color);
        Animal animal = builder.getAnimal();
        return animal;
    }
}
