package HW.model;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;

public class BaseHotDrinks {
    private List<HotDrinks> list;
    public BaseHotDrinks(){
        this.list = importList();
    }
    private List<HotDrinks> importList(){
        List<HotDrinks> list = new ArrayList<>();
        File file = new File("baseHotDrinks.txt");
        try(FileReader reader = new FileReader(file)){
            BufferedReader reader1 = new BufferedReader(reader);
            String line = reader1.readLine();
            while (line != null){
                String [] lineArray = line.split(";");
                list.add(new HotDrinks(
                        lineArray[0],
                        Float.parseFloat(lineArray[1]),
                        Double.parseDouble(lineArray[2]),
                        Integer.parseInt(lineArray[3])));
                line = reader1.readLine();
            }
        }catch (Exception e){
            System.out.println("Ошибка чтения из файла");
            e.printStackTrace();
        }
        return list;
    }
    public void addAtBase(String name, float price, double value, int temperature){
        this.list.add(new HotDrinks(name, price, value, temperature));
    }
    public void exportBase(){
        File file = new File("baseHotDrinks.txt");
        try(FileWriter writer = new FileWriter(file)){
            for(HotDrinks el: this.list){
                writer.write(
                        el.getName() + ";" +
                                el.getPrice() + ";" +
                                el.getVolume()+ ";" +
                                el.getTemp() + "\n");
            }
        }catch (Exception e){
            System.out.println("Ошибка записи в файл");
            e.printStackTrace();
        }
    }
    public List <HotDrinks> getList() {
        return list;
    }

    @Override
    public String toString() {
        StringBuffer buffer = new StringBuffer();
        for (HotDrinks el: list){
            buffer.append(el.toString()).append("\n");
        }
        return buffer.toString();
    }
}
