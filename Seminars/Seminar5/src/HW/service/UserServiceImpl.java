package HW.service;

import HW.model.*;
import HW.view.ConsoleUI;

public class UserServiceImpl implements UserService{
    public void start(){
        ConsoleUI consoleUI = new ConsoleUI();
        consoleUI.printMainMenu();
        String choice = consoleUI.setChoice("Выберите пункт");
        while(!choice.equalsIgnoreCase("exit")) {
            switch (choice) {
                case "1": // Добавить продукт в торговый автомат
                    consoleUI.printAddMenu();
                    String ch = consoleUI.setChoice("Выберите пункт");
                    if (ch.equalsIgnoreCase("1")){ // Бутилированный напиток
                        BaseBottleOfWater baseBW = new BaseBottleOfWater();
                        baseBW.addAtBase(
                                consoleUI.setChoice("Введите название"),
                                Float.parseFloat(consoleUI.setChoice("Введите цену")),
                                Double.parseDouble(consoleUI.setChoice("Введите объем")));
                        baseBW.exportBase();
                    } else if (ch.equalsIgnoreCase("2")) { // Горячий напиток
                        BaseHotDrinks baseHT = new BaseHotDrinks();
                        baseHT.addAtBase(
                                consoleUI.setChoice("Введите название"),
                                Float.parseFloat(consoleUI.setChoice("Введите цену")),
                                Double.parseDouble(consoleUI.setChoice("Введите объем")),
                                Integer.parseInt(consoleUI.setChoice("Введите температуру")));
                        baseHT.exportBase();
                    }else{
                        consoleUI.printMessage("Не корректный ввод!");
                    }
                    break;
                case "2": // Получить продукт из автомата
                    consoleUI.printAddMenu();
                    ch = consoleUI.setChoice("Выберите пункт");
                    if (ch.equalsIgnoreCase("1")){ // Бутилированный напиток
                        VendingMachineAllProducts<BottleOfWater> vendListBottle = new VendingMachineAllProducts<>();
                        BaseBottleOfWater baseBottleOfWater = new BaseBottleOfWater();
                        vendListBottle.initProduct(baseBottleOfWater.getList());

                        consoleUI.printBottleMenu();
                        String chMenu = consoleUI.setChoice("Выберите пункт");
                        if (chMenu.equalsIgnoreCase("1")){
                            consoleUI.printMessage(vendListBottle.getProduct(consoleUI.setChoice("Введите название")));
                        } else if (chMenu.equalsIgnoreCase("2")){
                            consoleUI.printMessage(vendListBottle.getProduct(Float.parseFloat(consoleUI.setChoice("Введите цену"))));
                        } else consoleUI.printMessage("Не корректный ввод!");

                    } else if (ch.equalsIgnoreCase("2")) { // Горячий напиток
                        VendingMachineAllProducts<HotDrinks> vendListHot = new VendingMachineAllProducts<>();
                        BaseHotDrinks baseHotDrinks = new BaseHotDrinks();
                        vendListHot.initProduct(baseHotDrinks.getList());

                        consoleUI.printHotMenu();
                        String chMenu = consoleUI.setChoice("Выберите пункт");
                        if (chMenu.equalsIgnoreCase("1")){
                            consoleUI.printMessage(vendListHot.getProduct(consoleUI.setChoice("Введите название")));
                        }else if(chMenu.equalsIgnoreCase("2")){
                            consoleUI.printMessage(vendListHot.getProduct(Float.parseFloat(consoleUI.setChoice("Введите цену"))));
                        } else if (chMenu.equalsIgnoreCase("3")) {
                            consoleUI.printMessage(vendListHot.getProduct(Integer.parseInt(consoleUI.setChoice("Введите температуру"))));
                        }else{
                            consoleUI.printMessage("Не корректный ввод!");
                        }
                    }else{
                        consoleUI.printMessage("Не корректный ввод!");
                    }
                    break;
                case "3":
                    consoleUI.printAddMenu();
                    ch = consoleUI.setChoice("Выберите пункт");
                    if (ch.equalsIgnoreCase("1")){
                        BaseBottleOfWater baseBottleOfWater = new BaseBottleOfWater();
                        consoleUI.printMessage(baseBottleOfWater.toString());
                    } else if(ch.equalsIgnoreCase("2")){
                        BaseHotDrinks baseHotDrinks = new BaseHotDrinks();
                        consoleUI.printMessage(baseHotDrinks.toString());
                    }else consoleUI.printMessage("Не корректный ввод!");
                    break;
                default:
                    consoleUI.printMessage("Не корректный ввод!");
            }
            consoleUI.printMessage("\n");
            consoleUI.printMainMenu();
            choice = consoleUI.setChoice("Выберите пункт");
        }
    }
}
