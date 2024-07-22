package session_15_oop_recap.practice.inheritance;

public class TestTwo {

    public static void main(String[] args) {
        Animal dog = new Dog( "Rex", 3 , "dog", "Husky",Size.LARGE);

        Dog dog2 = (Dog) dog;
        dog2.fetch();
        dog2.bark();
    }
}
