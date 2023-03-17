package Traning.T1;

public class Program {
    public static void main(String[] args) {
        Account<String> acc1 = new Account<>("123", 300);
        Account<Integer> acc2 = new Account<>(25,500);
        System.out.println("Тип данных в id acc1 = " + acc1.getId().getClass().getSimpleName());
        System.out.println("Тип данных в id acc2 = " + acc2.getId().getClass().getSimpleName());
    }
}
