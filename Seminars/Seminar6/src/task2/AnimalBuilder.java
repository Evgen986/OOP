package task2;

public class AnimalBuilder {
    private static AnimalBuilder instance = null;
    Dog obj;
    Cat obj2;

    private AnimalBuilder() {

    }

    public static AnimalBuilder getInstance(Animal animal) {
        if (animal instanceof Cat){
            if (instance == null)
                instance = new AnimalBuilder();
            instance.obj2 = new Cat();
        }else{
            if (instance == null)
                instance = new AnimalBuilder();
            instance.obj = new Dog();
        }


        return instance;
    }

    public AnimalBuilder setName(String name) {
        obj.setName(name);
        return this;
    }



    public AnimalBuilder age(int age) {
        obj.setAge(age);
        return this;
    }

    public AnimalBuilder weigth(int weigth) {
        obj.setWeigth(weigth);
        return this;
    }
    public AnimalBuilder breed(String breed) {
        obj.setBreed(breed);
        return this;
    }
    public AnimalBuilder oven(String oven) {
        obj.setOven(oven);
        return this;
    }


    public Cat build2(){
        return obj2;
    }
    public Dog build(){
        return obj;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "obj=" + obj +
                '}';
    }
}
