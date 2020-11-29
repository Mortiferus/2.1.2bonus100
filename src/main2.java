public class Main {
    public static void main(String[] args) {
        int threshold = 1000;
        int accountsRefill;
        accountsRefill = 1550;
        int currentBalanceKpks;
        currentBalanceKpks = 116_23;

        int bonus;
        if(accountsRefill > threshold) {
            bonus = accountsRefill / 100;
        } else {
            bonus = 0;
        }
        
        int totalBalanceKpks;
        totalBalanceKpks = currentBalanceKpks + accountsRefill * 100 + bonus * 100;

        System.out.println(totalBalanceKpks);
    }
}