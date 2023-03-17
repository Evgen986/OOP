package task1;

import task1.view.UserView;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите имя: ");
        String name = scanner.nextLine();
        System.out.println("Введите возраст: ");
        int age = scanner.nextInt();
        System.out.println("Введите зарплату: ");
        float salary = scanner.nextInt();
        UserView userView = new UserView();
        userView.saveUser(name, age, salary);
    }
}
