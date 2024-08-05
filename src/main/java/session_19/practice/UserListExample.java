package session_19.practice;

import java.util.Arrays;
import java.util.List;

public class UserListExample {

    public static void main(String[] args) {
        List<User> users = Arrays.asList(
                new User("John", "Doe", 25),
                new User("Bob", "Smith", 28),
                new User("Alice", "Carter", 23)
        );

        //print all users without stream
        users.forEach(System.out::println);

        //print all users with stream
        users.stream().forEach(System.out::println);
    }
}