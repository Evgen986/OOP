package Ex004.V3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class Repository<T extends Content> implements Iterable<T>{
    List<T> ds;

    private String name;

    public Repository(String name) {
        this.ds = new ArrayList<>();
        this.name = name;
        System.out.printf("\n  >>  %s created\n",this.name);
    }

    public void add(T content) {
        ds.add(content);
    }

    public int count() {
        return ds.size();
    }

    public T get(Integer index) {
        return ds.get(index);
    }

    @Override
    public Iterator<T> iterator() {
        return ds.iterator();
    }
//    class RepositoryIterator implements Iterator<T>{
//        private static int index;
//        @Override
//        public boolean hasNext() {
//            return index < ds.size();
//        }
//
//        @Override
//        public T next() {
//            return ds.get(index++);
//        }
//    }
    // В качестве тренировки реализуйте возможность работы с foreach

}
