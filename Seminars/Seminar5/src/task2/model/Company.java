package task2.model;

public class Company extends User{
    private float balance;

    public Company(String name, float balance) {
        super(name);
        this.balance = balance;
    }

    public float getBalance() {
        return balance;
    }

    public void setBalance(float balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "Company{" +
                "balance=" + balance +
                "} " + super.toString();
    }
}
