package Task1;

import java.util.Iterator;
import java.util.List;

public class ListOfDogsIterator implements Iterator<Dog> {
    private List<Dog> listOfDogIterable;
    public ListOfDogsIterator(List<Dog> listOfDogIterable) {
        this.listOfDogIterable = listOfDogIterable;

    }
    public static int count;

    @Override
    public boolean hasNext() {
        //System.out.println("В hasnext");
        //count++;
        //System.out.println("count в hasnext " + count);
        return count < listOfDogIterable.size();
    }

    @Override
    public Dog next() {
        if(!hasNext()) return null;
        //System.out.println("count в next " + count);
        return listOfDogIterable.get(count);
    }
}
