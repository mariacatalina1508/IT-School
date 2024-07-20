package session_13_abstraction.challenge.challenge_2;

public class TestBank {

    public static void main(String[] args) {
        BankA bankA = new BankA();
        BankB bankB = new BankB();
        BankC bankC = new BankC();

        System.out.println("BankA balance: " + bankA.getBalance());
        System.out.println("BankB balance: " + bankB.getBalance());
        System.out.println("BankC balance: " + bankC.getBalance());
    }
}