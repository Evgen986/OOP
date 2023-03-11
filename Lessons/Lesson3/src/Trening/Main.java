package Trening;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Cat> catList = new LinkedList<>(Arrays.asList(
                new Cat("Барсик", 15, "Серый"),
                new Cat("Мурка", 13, "Белый"),
                new Cat("Черныш", 125, "Черный")));
        for (Cat cat:catList) {
            System.out.println(cat);
        }
        catList.sort(Comparator.comparing(Cat::getColor));
        catList.forEach(System.out::println);
//        System.out.println("\n------СОРТИРОВКА ПО ЦВЕТУ--------");
//        System.out.println("------через Comparator вложенным классом sortByColor--------\n");
//        Collections.sort(catList, new sortByColor());
//        for (Cat cat:catList) {
//            System.out.println(cat);
//        }
//
//        System.out.println("\n------СОРТИРОВКА ПО ИМЕНИ--------");
//        System.out.println("------анонимным классом--------\n");
//        Collections.sort(catList, new Comparator<Cat>() {
//            @Override
//            public int compare(Cat cat1, Cat cat2) {
//                return cat1.getName().compareTo(cat2.getName());
//            }
//        });
//        for (Cat cat:catList) {
//            System.out.println(cat);
//        }
//
//        System.out.println("\n------СОРТИРОВКА ПО ВЕСУ--------");
//        System.out.println("------через Comparable в классе Cat--------\n");
//        Collections.sort(catList);
//        for (Cat cat:catList) {
//            System.out.println(cat);
//        }
//
//        System.out.println("\n------СОРТИРОВКА ПО ИМЕНИ--------");
//        System.out.println("------лябдой--------\n");
//        Collections.sort(catList, (cat1, cat2) -> cat1.getName().compareTo(cat2.getName()));
//        // БОЛЕЕ ПРОСТАЯ ЗАПИСЬ
//        catList.sort(Comparator.comparing(Cat::getName));
//        for (Cat cat:catList) {
//            System.out.println(cat);
//        }
//
//    }
//    static class sortByColor implements Comparator<Cat> {
//
//        @Override
//        public int compare(Cat cat1, Cat cat2) {
//            return cat1.getColor().compareTo(cat2.getColor());
//        }
    }
}
