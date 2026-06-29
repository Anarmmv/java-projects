public class BankAccount {
    String owner;
    double balance;

    BankAccount(String owner, double balance) {
        this.owner = owner;
        this.balance = balance;
    }

    void deposit(double amount) {
        balance += amount;
        System.out.println(amount + " AZN yatırıldı. Balans: " + balance);
    }

    void withdraw(double amount) {
        if (amount > balance) {
            System.out.println("Balans kifayət deyil!");
        } else {
            balance -= amount;
            System.out.println(amount + " AZN çıxarıldı. Balans: " + balance);
        }
    }

    void showBalance() {
        System.out.println(owner + " - Balans: " + balance + " AZN");
    }
}