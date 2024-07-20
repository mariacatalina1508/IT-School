package session_13_abstraction.challenge.challenge_3;

public class StudentA extends Marks {

    private int biology;
    private int math;
    private int english;

    public StudentA(int biology, int math, int english) {
        this.biology = biology;
        this.math = math;
        this.english = english;
    }

    @Override
    public double getPercentage() {
        return (biology + math + english) / (double) 3;
    }
}
