package task1.UI;

import java.util.Scanner;

public class ConsoleUI {
    Scanner scanner = new Scanner(System.in);

    public int setValue(String value){
        System.out.printf("Введите %s: ", value);
        return scanner.nextInt();
    }

    public void printResult(String example, int result){
        System.out.printf("%s = %d%n", example, result);
    }
}
