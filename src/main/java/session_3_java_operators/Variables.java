package session_3_java_operators;

public class Variables {

    public static void main(String[] args) {
        int age; //declaration
        age = 27; //initialization

        int value = 10; //declaration & initialization

        int outerVariable = 100;
        if (outerVariable > 50) {
            int innerVariable = 200;
            System.out.println(innerVariable + outerVariable);
        }
        //System.out.println(innerVariable); innerVariable - out a scope
        System.out.println(outerVariable);
    }
}
