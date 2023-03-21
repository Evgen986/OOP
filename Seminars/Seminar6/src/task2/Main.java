package task2;

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog = AnimalBuilder.getInstance(dog).setName("Псина").age(13).weigth(20).breed("dsff").oven("asdsdasd").build();
        Cat cat = new Cat();
        cat = AnimalBuilder.getInstance(cat).setName("Кошак").age(15).weigth(15).breed("dsf").oven("dsf").build2();
        System.out.println(dog.toString());
        System.out.println(cat.toString());
    }
}
