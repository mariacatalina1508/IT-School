package session_13_abstraction.challenge.challenge_4;

public class Test {

    public static void main(String[] args) {
        SubClass abs = new SubClass() {
            @Override
            public void method() {

            }
        };
        abs.method();
        abs.nonAbstractMethod();
    }
}
