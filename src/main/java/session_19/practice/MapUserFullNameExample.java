package session_19.practice;

import java.util.Arrays;
import java.util.List;

public class MapUserFullNameExample {

    public static void main(String[] args) {
        List<User> users = Arrays.asList(
                new User("John", "Doe", 25),
                new User("Bob", "Smith", 28),
                new User("Alice", "Carter", 23)
        );

        //map users to their full names and collect into a list
        List<String> fullNames = users.stream()
                .map(name -> name.getFirstName() + " " + name.getLastName())
                .toList();

        System.out.println(fullNames);
    }
}