package task2.view;

import java.util.Scanner;

public class Menu {
    private int choice;

    public int getChoice() {
        return choice;
    }

    public void setChoice(int choice) {
        this.choice = choice;
    }

    public void printMenu(){
        System.out.println("Выберите пункт меню:\n" +
                "1 - Создать контакт;\n" +
                "2 - Показать справочник;\n" +
                "3 - Увидеть контакт;\n" +
                "4 - Удалить контакт;\n" +
                "5 - Обновить контакт;\n" +
                "6 - Выход");
    }
    public void setChoice(){
        System.out.print("Введите цифру: ");
        this.choice = new Scanner(System.in).nextInt();
    }
}
