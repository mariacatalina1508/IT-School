package session_14_polymorphism.practice.compiletime_polymorphism;

public class Geometry {

    //calculate area of a circle
    public double area(double radius) {
        return Math.PI * radius * radius;
    }

    //calculate area of a triangle
    public double area(double base, double height) {
        return 0.5 * base * height;
    }
}
