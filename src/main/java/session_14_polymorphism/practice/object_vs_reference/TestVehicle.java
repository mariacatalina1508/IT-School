package session_14_polymorphism.practice.object_vs_reference;

public class TestVehicle {

    public static void main(String[] args) {
        Vehicle car = new Car();
        Vehicle truck = new Truck();

        //ctr+alt+b - go to the implementation of the method
        System.out.println(car.fuelType());
        System.out.println(truck.fuelType());

        //explicit casting
        Car anotherCar = (Car)car;
    }
}
