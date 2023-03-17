package Traning.T2;

public class Account3 {
    private String id;
    private int sum;
    <T> Account3(T id, int sum){
        this.id = id.toString();
        this.sum = sum;
    }

    public String getId() {
        return id;
    }

    public int getSum() {
        return sum;
    }
}
