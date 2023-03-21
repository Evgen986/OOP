package task2;

public class CatBuilder {
    private static CatBuilder instance = null;
    Cat obj;

    private CatBuilder() {

    }

    public static CatBuilder getInstance() {
        if (instance == null)
            instance = new CatBuilder();
        instance.obj = new Cat();

        return instance;
    }

    public CatBuilder setName(String name) {
        obj.setName(name);
        return this;
    }



    public CatBuilder age(int age) {
        obj.setAge(age);
        return this;
    }

    public CatBuilder weigth(int weigth) {
        obj.setWeigth(weigth);
        return this;
    }
    public CatBuilder breed(String breed) {
        obj.setBreed(breed);
        return this;
    }
    public CatBuilder oven(String oven) {
        obj.setOven(oven);
        return this;
    }


    public Cat build(){
        return obj;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "obj=" + obj +
                '}';
    }
}
