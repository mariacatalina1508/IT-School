package session_17_equals_hashcode_generics.challenge.challenge_6;

public enum LightColor {

    RED ("Stop", 30),
    YELLOW("Caution", 5),
    GREEN("GO", 45);

    private final String action;
    private final int duration;

    LightColor(String action, int duration) {
        this.action = action;
        this.duration = duration;
    }

    public String getAction() {
        return action;
    }

    public int getDuration() {
        return duration;
    }

    @Override
    public String toString() {
        return this.name() + " (" + action + ", " + duration + " seconds)";
    }

    public static void main(String[] args) {
        for (LightColor color : LightColor.values()) {
            System.out.println(color);
        }
    }
}
