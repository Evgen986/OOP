package HW.model;

public class Start {
    public static void main(String[] args) {
        Director director = new Director();
        director.setBuilder(new CatBuilder());
        Director director2 = new Director();
        director.setBuilder(new DogBuilder());
        Animal animal = director.buildAnimal(2, "Котеич", 20, 25.5, "серый");
        System.out.println(animal);
        Animal animal2 = director2.buildAnimal(1, "Песель", 12, 12.5, "черный");
        System.out.println(animal2);
    }
}
