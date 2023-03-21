package HW.UI;

import HW.UI.command.Command;
import HW.UI.command.ListCommands;
import HW.UI.command.cerateAnimals.CreateCat;
import HW.UI.command.cerateAnimals.CreateDog;
import HW.UI.command.mainMenu.AddAnimal;
import HW.UI.command.mainMenu.Exit;
import HW.UI.command.mainMenu.PrintAnimals;
import HW.UI.command.printAnimals.PrintCats;
import HW.UI.command.printAnimals.PrintDogs;

import java.util.Scanner;

public class UIConsole {

    public void mainMenu(){
        Command addAnimal = new AddAnimal("Создать животное");
        Command printAnimals = new PrintAnimals("Показать животных");
        Command exit = new Exit("Выйти из программы");
        ListCommands mainMenuList = new ListCommands();
        mainMenuList.setCommand(addAnimal);
        mainMenuList.setCommand(printAnimals);
        mainMenuList.setCommand(exit);
        for (int i = 0; i < mainMenuList.getSize(); i++){
            System.out.printf("%d - %s;%n", i+1, mainMenuList.getList().get(i));
        }
        int choice = getChoiceCommand(mainMenuList.getSize());
        if (choice >= 0) mainMenuList.getList().get(choice).actionCommand();
    }
    public void createMenu(){
        Command createDog = new CreateDog("Создать собаку");
        Command createCat = new CreateCat("Создать кошку");
        ListCommands createMenu = new ListCommands();
        createMenu.setCommand(createDog);
        createMenu.setCommand(createCat);
        for (int i = 0; i < createMenu.getSize(); i++){
            System.out.printf("%d - %s;%n", i+1, createMenu.getList().get(i));
        }
        int choice = getChoiceCommand(createMenu.getSize());
        if (choice >= 0) createMenu.getList().get(choice).actionCommand();
    }
    public void printAnimals(){
        Command printDogs = new PrintDogs("Показать собак");
        Command printCats = new PrintCats("Показать кошек");
        ListCommands printAnimalsMenu = new ListCommands();
        printAnimalsMenu.setCommand(printDogs);
        printAnimalsMenu.setCommand(printCats);
        for (int i = 0; i < printAnimalsMenu.getSize(); i++){
            System.out.printf("%d - %s;%n", i+1, printAnimalsMenu.getList().get(i));
        }
        int choice = getChoiceCommand(printAnimalsMenu.getSize());
        if (choice >= 0) printAnimalsMenu.getList().get(choice).actionCommand();
    }
    public int getChoiceCommand(int sizeList){
        System.out.print("Введите номер команды: ");
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()){
            int choice = sc.nextInt();
            if(choice > 0 && choice <= sizeList) return choice-1;
        }
        return -1;
    }
}
