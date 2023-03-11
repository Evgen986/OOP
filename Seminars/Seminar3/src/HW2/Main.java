package HW2;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ListOfCats cats = new ListOfCats();
        cats.setCatList(List.of(
                new Cat("barsik", 5, "white"),
                new Cat("murzik", 7, "black"),
                new Cat("pushok", 4, "gray")));
        System.out.println(cats.iterator().next().toString());
        while (cats.iterator().hasNext()){
            System.out.println(cats.iterator().next().getName());
        }
    }
}
