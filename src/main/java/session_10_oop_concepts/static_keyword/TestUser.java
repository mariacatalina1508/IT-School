package session_10_oop_concepts.static_keyword;

import static session_10_oop_concepts.static_keyword.Validator.isValidUser;

public class TestUser {

    public static void main(String[] args) {
        User user1 = new User();
        user1.setFirstName("Alice");
        user1.setLastName("Doe");
        user1.setAge(25);

        User user2 = new User("John", "Williams", 29);

        System.out.println(user1.getFirstName());
        System.out.println(user1.getLastName());
        System.out.println(user1.getAge());

        //Validator validator = new Validator();
        //validator.isValidUser(user1);
        boolean isValidUser = isValidUser(user1);
        System.out.println(isValidUser);

        System.out.println(user2);
    }
}
