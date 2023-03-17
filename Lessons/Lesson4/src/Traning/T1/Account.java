package Traning.T1;
/**
 * Класс для создания экземпляров счета клиента
 * с полем id как с типом String, так и с типом int
 * @param <T>
 */
public class Account <T>{
    private T id;
    private int sum;

    public Account(T id, int sum) {
        this.id = id;
        this.sum = sum;
    }

    public T getId() {
        return id;
    }

    public int getSum() {
        return sum;
    }

    public void setSum(int sum) {
        this.sum = sum;
    }

    @Override
    public String toString() {
        return "Account{" +
                "id=" + id +
                ", sum=" + sum +
                '}';
    }
}
