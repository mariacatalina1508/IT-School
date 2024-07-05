package session_10_oop_concepts.practice.public_package;

import session_10_oop_concepts.practice.sensitive_logic_package.Animal;

public class Test {

    public static void main(String[] args) {
        Animal dog = new Animal("Rex", 15.2, 2);
    }
}

class Human {

    static String name;

    public int sum(int number1, int number2) {
        return number1 + number2;
    }
}
