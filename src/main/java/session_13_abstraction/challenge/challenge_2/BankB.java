package session_13_abstraction.challenge.challenge_2;

public class BankB extends Bank {

    private double deposit = 150;

    @Override
    public double getBalance() {
        return deposit;
    }
}
