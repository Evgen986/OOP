package HW.model;

public abstract class AnimalBuilder {
    Animal animal;
//    public void createAnimal(){
//        animal = new Animal();
//
//    }
    public void createAnimal(int choice){
        if (choice == 1) animal = new Dog();
        else animal = new Cat();
    }
    abstract void buildType(); // ????
    abstract void buildName(String name);
    abstract void buildAge(int age);
    abstract void buildWeight(double weight);
    abstract void buildColor(String color);
    Animal getAnimal(){
        return animal;
    }
}
