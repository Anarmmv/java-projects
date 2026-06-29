public class Main {
    public static void main(String[] args) {
        BankAccount hesab = new BankAccount("Anar", 100);

        hesab.showBalance();
        hesab.deposit(50);
        hesab.withdraw(30);
        hesab.withdraw(200);
        hesab.showBalance();
        Bank bank = new Bank();

        BankAccount anar = new BankAccount("Anar", 500);
        BankAccount ali = new BankAccount("Ali", 200);
        BankAccount leyla = new BankAccount("Leyla", 300);

        bank.addAccount(anar);
        bank.addAccount(ali);
        bank.addAccount(leyla);

        bank.showAllAccounts();

        bank.transfer(anar, ali, 100);
        bank.transfer(leyla, anar, 50);
        bank.transfer(ali, leyla, 500);

        bank.showAllAccounts();
    }
}