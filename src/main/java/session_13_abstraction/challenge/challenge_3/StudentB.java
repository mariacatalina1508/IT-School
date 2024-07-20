package session_13_abstraction.challenge.challenge_3;

public class StudentB extends Marks {

    private int biology;
    private int math;
    private int english;
    private int chemistry;

    public StudentB(int biology, int math, int english, int chemistry) {
        this.biology = biology;
        this.math = math;
        this.english = english;
        this.chemistry = chemistry;
    }

    @Override
    public double getPercentage() {
        return (biology + math + english + chemistry) / (double) 4;
    }
}
