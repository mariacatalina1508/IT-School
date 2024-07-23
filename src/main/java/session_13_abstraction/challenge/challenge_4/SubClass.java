package session_13_abstraction.challenge.challenge_4;

public abstract class SubClass {

    void AbstractClass() {
        System.out.println("Abstract class constructor");
    }

    public abstract void method();

    public void nonAbstractMethod() {
        System.out.println("Non abstract method");
    }
}
