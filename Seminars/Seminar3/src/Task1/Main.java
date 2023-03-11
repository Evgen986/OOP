package Task1;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        ListOfDogs listDogs = new ListOfDogs();
        listDogs.setListDogs(Arrays.asList(
                new Dog("Бобик"),
                new Dog("Шарик"),
                new Dog("Полкан")));
        //for (int i = 0; i < listDogs.siz)
        while (listDogs.iterator().hasNext()){
            System.out.println(listDogs.iterator().next());
            ListOfDogsIterator.count++;

        }
    }

}
