package session_11_inheritance_encapsulation.challenge.vehicle.multilevel_inheritance;

public class BikeTest {

    public static void main(String[] args) {
        Bicycle bicycle = new Bicycle();
        bicycle.setSpeed(90);
        System.out.println("Your speed is : " + bicycle.getSpeed());
        System.out.println("Your gear is " + bicycle.changeGear());
        bicycle.speedUp(35);
        System.out.println(bicycle.getSpeed());
        bicycle.applyBreak(50);
        System.out.println(bicycle.getSpeed());
    }
}
