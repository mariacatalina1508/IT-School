package session_11_inheritance_encapsulation.challenge.vehicle.hierarchical_inheritance;

public class Bicycle {
    private int speed;
    private int gear;

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getGear() {
        return gear;
    }

    public void setGear(int gear) {
        this.gear = gear;
    }

    public int speedUp(int speed) {
        return this.speed += speed;
    }

    public int applyBreak(int brake) {
        speed -= brake;
        if (speed < 0) {
            speed = 0;
        }
        return speed;
    }

    public int changeGear() {
        if (speed <= 0) {
            setGear(0);
        } else if (speed >= 80) {
            setGear(1);
        } else if (speed >= 60) {
            setGear(2);
        } else if (speed >= 40) {
            setGear(3);
        } else if (speed >= 20) {
            setGear(4);
        } else {
            setGear(5);
        }
        return this.gear;
    }
}
