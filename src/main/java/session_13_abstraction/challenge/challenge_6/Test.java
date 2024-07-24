package session_13_abstraction.challenge.challenge_6;

public class Test {

    public static void main(String[] args) {
        Area area1 = new Area();

        System.out.println("Square area is: " + area1.squareArea(7.5));
        System.out.println("Rectangle area is: " + area1.rectangleArea(15.5, 7));
        System.out.println("Circle area is: " + area1.circleArea(7.5));
    }
}