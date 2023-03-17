package task2.model;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class ExportBase {
    private File file = new File("base.txt");

    private FileWriter fileWriter;

    {
        try {
            fileWriter = new FileWriter(file);
        } catch (IOException e) {
            System.out.println("Ошибка");
        }
    }
    public void exportBaseWithFile(BaseList list){
        try {
            for (Contact contact: list) {
                fileWriter.write(contact.getSurname() + ";" + contact.getTelephone() + "\n");
            }
            fileWriter.close();
        } catch (IOException e){
            System.out.println("Ошибка при записи в файл");
        }
    }
}
