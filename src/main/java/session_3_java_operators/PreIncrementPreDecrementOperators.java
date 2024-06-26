package session_3_java_operators;

public class PreIncrementPreDecrementOperators {

    public static void main(String[] args) {
        //pre-increment operator
        int x = 5;
        int y = ++x;

        System.out.println("x: " + x); //6
        System.out.println("y: " + y); //6

        //pre-decrement operator
        int z = 4;
        int w = --z;
        System.out.println("z: " + z);
        System.out.println("w: " + w);
    }
}
