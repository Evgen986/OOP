package task2.model;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class BaseList implements Iterable<Contact>{
    private List<Contact> baseList;
    private int index;

    public BaseList() {
        baseList = new ArrayList<>();
    }

    public void addAtList(Contact contact){
        baseList.add(contact);
    }

    @Override
    public Iterator<Contact> iterator() {
        return baseList.iterator();
    }

    public boolean delCont(String name){
        int index = -1;
        for (int i = this.baseList.size()-1; i >= 0; i--){
            if (baseList.get(i).getSurname().equals(name)) {
                index = i;
                baseList.remove(index);
                return true;
            }
        }
        return false;
    }

    public boolean editCont(String lastName, String newName, String phone){
        int index = -1;
        for (int i = this.baseList.size()-1; i >= 0; i--){
            if (baseList.get(i).getSurname().equals(lastName)) {
                index = i;
                baseList.set(index, new Contact(newName, phone));
                return true;
            }
        }
        return false;
    }
}
