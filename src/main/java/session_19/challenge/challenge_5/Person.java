package session_19.challenge.challenge_5;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Person {
    String firstName;
    String lastName;
    int age;

    // Constructor
    Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    // Override toString() for better output readability
    @Override
    public String toString() {
        return firstName + " " + lastName + " (Age: " + age + ")";
    }
}