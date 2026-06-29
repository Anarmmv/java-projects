import java.util.ArrayList;
import java.util.List;

public class Bank {
    List<BankAccount> accounts = new ArrayList<>();

    void addAccount(BankAccount account) {
        accounts.add(account);
        System.out.println(account.owner + " - hesab açıldı!");
    }

    void transfer(BankAccount from, BankAccount to, double amount) {
        if (from.balance < amount) {
            System.out.println("Balans kifayət deyil!");
        } else {
            from.balance -= amount;
            to.balance += amount;
            System.out.println(amount + " AZN " + from.owner + " -> " + to.owner + " köçürüldü!");
        }
    }

    void showAllAccounts() {
        System.out.println("--- Bütün Hesablar ---");
        for (BankAccount acc : accounts) {
            acc.showBalance();
        }
    }
}
