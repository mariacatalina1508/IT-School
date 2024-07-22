package session_15_oop_recap.practice.abstraction;

public class Car implements Vehicle {

    @Override
    public void accelerate() {
        System.out.println("Car is accelerating");
    }

    @Override
    public void stop() {
    }

    @Override
    public void start() {
    }
}