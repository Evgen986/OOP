package Traning.T2;

public class Program {
    public static void main(String[] args) {
        Account acc = new Account("254", 200);
        System.out.println("Тип данных id acc = " + acc.getId().getClass().getSimpleName());

        Account2<Integer> acc2 = new Account2<>(123,300);
        System.out.println("Тип данных id acc2 = " + acc2.getId().getClass().getSimpleName());

        String num = "1";
        Integer[] arr = {5,2,3,4,1};
        System.out.println("Результат работы обощеного метода = " + isContains(num, arr));

        Account3 acc3 = new Account3(123, 500);
        System.out.println("Тип данных id acc3 (при подаче на вход int) = " + acc3.getId().getClass().getSimpleName());
    }
    public static <I, A> boolean isContains(I item, A [] array){
        for (A el:array) {
            if(el == item) return true;
        }
        return false;
    }
}
