package session_13_abstraction.challenge.challenge_4;

public abstract class AbstractClass {

    AbstractClass() {
        System.out.println("Abstract class constructor");
    }

    public abstract void a_method();

    public void nonAbstractMethod() {
        System.out.println("Normal method");
    }
}