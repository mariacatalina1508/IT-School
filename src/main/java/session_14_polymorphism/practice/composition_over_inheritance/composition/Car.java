package session_14_polymorphism.practice.composition_over_inheritance.composition;

public class Car {

    //HAS-A - Car - Engine
    private Engine engine;

    public Car(Engine engine) {
        this.engine = engine;
    }

    void start() {
        engine.start();
    }
}
