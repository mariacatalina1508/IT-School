package session_15_oop_recap.practice.abstraction;

public class Motorcycle implements Vehicle {

    @Override
    public void accelerate() {
        System.out.println("Motorcycle is accelerating");
    }

    @Override
    public void stop() {
    }

    @Override
    public void start() {
    }
}