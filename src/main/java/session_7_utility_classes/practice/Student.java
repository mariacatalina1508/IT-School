package session_7_utility_classes.practice;

public class Student {

    String name;
    int age;

    public void displayDateils() {
        System.out.println("Name: " + name + " Age: " + age);

    }
    @Override
    public String toString() {
        return "Name: " + name + " Age: " + age;
    }


}
