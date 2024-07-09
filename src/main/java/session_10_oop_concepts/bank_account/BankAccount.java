package session_10_oop_concepts.bank_account;

public class BankAccount {

    private String accountNumber;
    private double balance;

    public double withdraw(double amount) {
        if (balance >= amount) {
            return balance - amount;
        }

        System.out.println("You don't have enough money");
        return balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
