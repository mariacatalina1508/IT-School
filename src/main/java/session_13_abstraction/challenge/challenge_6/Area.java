package session_13_abstraction.challenge.challenge_6;

public class Area extends Shape {

    @Override
    public double rectangleArea(double lenght, double breadth) {
        return lenght * breadth;
    }

    @Override
    public double squareArea(double side) {
        return side * side;
    }

    @Override
    public double circleArea(double radius) {
        return Math.PI * radius * radius;
    }
}
