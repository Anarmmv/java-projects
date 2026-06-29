public class Main {
    public static void main(String[] args) {
        BankAccount hesab = new BankAccount("Anar", 100);

        hesab.showBalance();
        hesab.deposit(50);
        hesab.withdraw(30);
        hesab.withdraw(200);
        hesab.showBalance();
    }
}