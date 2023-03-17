package Ex004.V3;

import java.util.Iterator;
import java.util.List;
import java.util.Spliterator;
import java.util.function.Consumer;

public class IterRepository <T> implements Iterator<T>{
    private List<T> list;
    private int count;

    public IterRepository(List<T> list) {
        this.list = list;
    }

    @Override
    public boolean hasNext() {
        return count < list.size();
    }

    @Override
    public T next() {
        count++;
        return list.get(count-1);
    }
}
