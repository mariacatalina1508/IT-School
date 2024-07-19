package session_14_polymorphism.practice.runtime_polymorphism;

public class Apple extends Fruit {

    //virtual methods

    @Override
    public String taste() {
        return "apple is sweet";
    }

    @Override
    public String colour() {
        return "apple is red";
    }
}