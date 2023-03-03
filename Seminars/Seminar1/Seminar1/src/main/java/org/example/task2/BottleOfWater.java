package org.example.task2;

public class BottleOfWater extends Product{
    private String name;
    private int price;

    /**
     * Получение названия напитка
     * @return название напитка
     */
    @Override
    public String getName() {
        return name;
    }

    /**
     * Установка названия напитка
     * @param name название напитка
     */
    @Override
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Получение цены напитка
     * @return цена напитка
     */
    @Override
    public int getPrice() {
        return price;
    }

    /**
     * Установка цены напитка
     * @param price цена напитка
     */
    @Override
    public void setPrice(int price) {
        this.price = price;
    }

    /**
     * Перегруженный метод toString
     * @return содержимое экземпляра класса в читаемом виде
     */
    @Override
    public String toString() {
        return "BottleOfWater{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }

    /**
     * Конструктор класса Бутилированной воды
     * @param name название напитка
     * @param price цена напитка
     */
    public BottleOfWater(String name, int price) {
        this.name = name;
        this.price = price;
    }
}
