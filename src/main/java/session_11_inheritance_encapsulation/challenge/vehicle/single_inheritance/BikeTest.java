package session_11_inheritance_encapsulation.challenge.vehicle.single_inheritance;

import session_11_inheritance_encapsulation.challenge.vehicle.hierarchical_inheritance.Bicycle;
import session_11_inheritance_encapsulation.challenge.vehicle.hierarchical_inheritance.MountainBike;

public class BikeTest {

    public static void main(String[] args) {
        session_11_inheritance_encapsulation.challenge.vehicle.hierarchical_inheritance.Bicycle bicycle = new Bicycle();
        bicycle.setSpeed(70);
        System.out.println("Current speed " + bicycle.getSpeed());
        System.out.println("Gear after change " + bicycle.changeGear());

        bicycle.applyBreak(45);
        System.out.println("Current speed " + bicycle.getSpeed());
        System.out.println("Gear after change " + bicycle.changeGear());

        bicycle.speedUp( 30);
        System.out.println("Current speed " + bicycle.getSpeed());
        System.out.println("Gear after change " + bicycle.changeGear());

        session_11_inheritance_encapsulation.challenge.vehicle.hierarchical_inheritance.MountainBike mountainBike = new MountainBike();
        mountainBike.setSpeed(10);
        mountainBike.setSuspension("Off Road") ;
        System.out.println("Actuality speed " + mountainBike.getSpeed());
        System.out.println("Gear after change " + mountainBike.changeGear());
        System.out.println("On this road: "+mountainBike.getSuspension()+ " You have " + mountainBike.adjustSuspension(mountainBike.getSuspension()));
    }
}
