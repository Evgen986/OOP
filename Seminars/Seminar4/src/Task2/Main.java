package Task2;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        ListOfDogs listDogs = new ListOfDogs();
        listDogs.setListDogs(Arrays.asList(
                new Dog("Бобик", 20, "Черный"),
                new Dog("Шарик", 15, "Белый"),
                new Dog("Полкан", 7, "Красный")));
        ListOfCats listOfCats = new ListOfCats();
        listOfCats.setListCat(Arrays.asList
                (new Cat("Платон", 25), new Cat("Барсик", 15),(new Cat("Альфред", 2))));

        System.out.println("--------Перебор итератором--------");
        Iterator<Dog> iter = listDogs.iterator();
        while (iter.hasNext()){
            System.out.println(iter.next());
        }

        System.out.println("\n--------Сортировка через класс ComparableOfNameAnimal по имени \"СОБАКИ\"--------");
        listDogs.getListDogs().sort(new ComparableOfNameAnimal());
        for (Dog dog: listDogs){
            System.out.println(dog);
        }
        System.out.println("\n--------Сортировка через класс ComparableOfNameAnimal по имени \"КОТЫ\"--------");
        listOfCats.getListCats().sort(new ComparableOfNameAnimal());
        for (Cat cat: listOfCats){
            System.out.println(cat);
        }
    }
}
