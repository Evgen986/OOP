package task2.model;

import java.io.File;
import java.io.StringReader;

public interface Operation {
    String addContact(String name, String telephone, BaseList list);
    String findContact(String name, BaseList list);

    String delContact(String name, BaseList list);

    String printBase(BaseList list);

    String editContact(String lastName, String newName, String phone, BaseList list);
}
