package session_13_abstraction.challenge.challenge_1;

public class TestParent {

    public static void main(String[] args) {
        SubclassOne subclassOne = new SubclassOne();
        SubclassTwo subclassTwo = new SubclassTwo();

        subclassOne.message();
        subclassTwo.message();
    }
}
