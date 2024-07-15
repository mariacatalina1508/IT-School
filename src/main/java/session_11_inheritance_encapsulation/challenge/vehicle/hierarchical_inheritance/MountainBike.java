package session_11_inheritance_encapsulation.challenge.vehicle.hierarchical_inheritance;

public class MountainBike extends Bicycle {
    private String tireType;
    private String suspension;

    public String getTireType() {
        return tireType;
    }

    public void setTireType(String tireType) {
        this.tireType = tireType;
    }

    public String getSuspension() {
        return suspension;
    }

    public void setSuspension(String suspension) {
        this.suspension = suspension;
    }

    public String adjustSuspension(String typeOfRoad) {
        if (typeOfRoad == "Off Road") {
            return "Suspension mode Boost";
        } else if (typeOfRoad == "Road") {
            return "Suspension mode Lowrider";
        } else {
            return "Suspension mode balanced";
        }
    }
}