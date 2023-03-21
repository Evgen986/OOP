package HW2;

import HW2.service.Service;

/**
 * Точка входа
 */
public class Program {
    public static void main(String[] args) {
        Service service = new Service();
        service.start();
    }
}
