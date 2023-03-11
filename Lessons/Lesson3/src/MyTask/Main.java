package MyTask;

import java.math.BigDecimal;
import java.util.*;

/**
 * Подумать над структурой класса Ноутбук для магазина техники - выделить поля и методы. Реализовать в java.
 * • Создать множество ноутбуков.
 * • Написать метод, который будет запрашивать у пользователя критерий (или критерии) фильтрации и выведет ноутбуки,
 *   отвечающие фильтру. Критерии фильтрации можно хранить в Map.
 *   Например: Введите цифру, соответствующую необходимому критерию:
 * 1 - ОЗУ
 * 2 - Объем ЖД
 * 3 - Операционная система
 * 4 - Цвет …
 * • Далее нужно запросить минимальные значения для указанных критериев - сохранить параметры фильтрации можно также в Map.
 * • Отфильтровать ноутбуки их первоначального множества и вывести проходящие по условиям.
 */
public class Main {
    public static void main(String[] args) {
        Laptop lap1 = new Laptop("Lenovo", "Legion 5 PRO", 16.0, 2021,
                "Windows", "AMD", "Ryzen 5 5600H", 16,
                "Discrete/BuiltIn", "AMD Radeon Graphics",
                "Nvidia RTX 3060", 6, "SSD", 512, 0,
                "Game", "Gray", new BigDecimal(1000));
        Laptop lap2 = new Laptop("Asus", "VivoBook", 15.6, 2021,
                "NoOS", "Intel", "Core i3-1115G4", 8,
                "BuiltIn", "Intel UHD Graphics", "-",
                0, "SSD", 512, 0,
                "Hybrid", "Blue", new BigDecimal(500));
        Laptop lap3 = new Laptop("MSI", "Modern 15", 15.6, 2022,
                "Windows", "Intel", "Core i3-1215U", 8,
                "BuiltIn", "Intel UHD Graphics", "-",
                0, "SSD", 512, 0,
                "Hybrid", "Black", new BigDecimal(700));
        Laptop lap4 = new Laptop("HP", "255", 15.6, 2020,
                "NoOS", "AMD", "Athlon Gold 3150U", 8,
                "BuiltIn", "AMD Radeon Graphics", "-",
                0, "HDD", 0, 1000,
                "Office", "Silver", new BigDecimal(300));

        List<Laptop> allLaptops = new ArrayList<>(Arrays.asList(lap1, lap2, lap3, lap4));


    }
}
