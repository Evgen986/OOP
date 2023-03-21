package cw02;

public class AnimalBuilder {
    private static AnimalBuilder instance = null;
    private AnimalBuilder() {

    }

    public static CatBuilder getInstanceCat() {
        CatBuilder catBuilder = new CatBuilder();

        if (catBuilder.instance == null)
            catBuilder.instance = new CatBuilder();
        catBuilder.instance.obj = new Cat();

        return catBuilder;}
    public static DogBuilder getInstanceDog() {
        DogBuilder dogBuilder = new DogBuilder();

        if (dogBuilder.instance == null)
            dogBuilder.instance = new DogBuilder();
        dogBuilder.instance.obj = new Dog();
        return new DogBuilder();
    }
}
