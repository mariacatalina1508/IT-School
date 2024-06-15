package session_3_java_operators;

public class PreIncrementPreDecrementOperators {

    public static void main(String)[] args) {
    //pre-increment operator
        int x = 5;
        int y = ++x;
        System.out.println("x: " + x) ;
        System.out.println("y: " + y);

        //pre-decrement operator
        int z = 4;
        int w = --z;
        System.out.println("z: " + z);
        System.out.println("W: " + w);

        //post-decrement
        int z = 4;
        int w = z--;
        System.out.println("z: " + z); //3
        System.out.println("w: " + w); //4
        int b = 3;
        int c = ++b * 5 / b-- + --b;
        System.out.println("b: is " + b);
        System.out.println("c: is " + c);

}
}
