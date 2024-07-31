package session_17_equals_hashcode_generics.challenge.challenge_2;

import java.util.Objects;

public class Person {

    private String name;
    private int age;
    private String email;

    public Person(String name, int age, String email) {
        this.name = name;
        this.age = age;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public boolean equals(Object obj) {
        if (this==obj)
            return true;
        if (obj==null || getClass() != obj.getClass())
            return false;
        Person person = (Person)obj;
        return age == person.age && Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    @Override
    public String toString() {
        return "Person [name=" + name + ", age=" + age + ", email=" + email + "]";
    }

    public static void main(String[] args) {
        Person person1 = new Person("John Doe", 30, "john.doe@example.com");
        Person person2 = new Person("John Doe", 30, "john.diff@example.com");
        Person person3 = new Person("Jane Doe", 25, "jane.doe@example.com");

        System.out.println("person1 equals person2: " + person1.equals(person2)); // Should return true
        System.out.println("person1 equals person3: " + person1.equals(person3)); // Should return false

        System.out.println("person1 hashCode: " + person1.hashCode());
        System.out.println("person2 hashCode: " + person2.hashCode());
        System.out.println("person3 hashCode: " + person3.hashCode());

        System.out.println("person1 and person2 have the same hashCode: " + (person1.hashCode() == person2.hashCode()));
    }
}