package task2.view;

import java.util.Scanner;

public class ConsoleUI {
    public String getValue(String value){
        System.out.printf("Введите %s: ", value);
        return new Scanner(System.in).nextLine();
    }

    public void printMessage(String message){
        System.out.println(message + "\n");
    }
}
