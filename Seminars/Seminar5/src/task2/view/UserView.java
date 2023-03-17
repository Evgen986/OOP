package task2.view;

import task2.model.Company;
import task2.model.Human;
import task2.model.UsersList;
import task2.service.UserService;
import task2.service.UserServiceImpl;

import java.util.Scanner;

public class UserView {
    public void start() {
        UsersList listH = new UsersList();
        UsersList listC = new UsersList();
        UserService us = new UserServiceImpl();
        Menu.printMenu();
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();
        if (choice == 1) {
            String name = scanner.nextLine();
            int age = scanner.nextInt();
            float salary = scanner.nextInt();

        }
    }
}
