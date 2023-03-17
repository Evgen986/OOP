package task2.model;

import java.io.*;


public class ImportBase {
    private File file = new File("base.txt");
    private FileReader fileReader;


    {
        try {
            fileReader = new FileReader(file);
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден!");
        }
    }

    public void importWithFile(BaseList baseList) {
        BufferedReader reader = new BufferedReader(fileReader);
        try {
            String line = reader.readLine();
            while (line != null) {
                String[] lineArray = line.split(";");
                baseList.addAtList(Contact.getContact(lineArray[0], lineArray[1]));
                line = reader.readLine();
            }
        }catch (IOException e){
            System.out.println("Нет данных в файле");
        }
    }
}
