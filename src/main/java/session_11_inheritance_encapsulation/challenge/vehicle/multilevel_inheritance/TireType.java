package session_11_inheritance_encapsulation.challenge.vehicle.multilevel_inheritance;

    public class TireType extends MountainBike {
        private String tireModelName;
        private String tireType;
        private double tireSize;

        private String getTireModelName() {
            return tireModelName;
        }

        private void setTireModelName(String tireModelName) {
            this.tireModelName = tireModelName;
        }

        public String getTireType() {
            return tireType;
        }

        public void setTireType(String tireType) {
            this.tireType = tireType;
        }

        public double getTireSize() {
            return tireSize;
        }

        public void setTireSize(double tireSize) {
            this.tireSize = tireSize;
        }
    }
