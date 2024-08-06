package session_19.challenge.challenge_5;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class PeopleFilter {
    public static void main(String[] args) {
        // List of people
        List<Person> people = Arrays.asList(
                new Person("Alice", "Johnson", 20),
                new Person("Bob", "Smith", 17),
                new Person("Charlie", "Brown", 22),
                new Person("Diana", "White", 16)
        );

        // Use streams to filter people older than 18
        List<Person> adults = people.stream()
                .filter(person -> person.age > 18)
                .collect(Collectors.toList());

        // Print the list of adults
        adults.forEach(System.out::println);
    }
}