public class Main {
    public static void main(String[] args) {
        int threshold = 1000;
        int accountsRefill;
        int bonus;
        accountsRefill = 1100;
        if(accountsRefill > threshold) {
            bonus = accountsRefill / 100;
        } else {
            bonus = 0;
        }

        System.out.println(bonus);
    }
}