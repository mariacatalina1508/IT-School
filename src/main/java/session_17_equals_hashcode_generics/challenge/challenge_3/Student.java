package session_17_equals_hashcode_generics.challenge.challenge_3;

import java.util.Objects;

public class Student {


    private String name;
    private int age;
    private String studentId;
    private String email;

    public Student(String name, int age, String studentId, String email) {
        this.name = name;
        this.age = age;
        this.studentId = studentId;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getStudentId() {
        return studentId;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass())
            return false;
        Student student = (Student) obj;
        return age == student.age &&
                Objects.equals(name, student.name) &&
                Objects.equals(email, student.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, email);
    }

    @Override
    public String toString() {
        return "Student [name=" + name + ", age=" + age + ", studentId=" + studentId + ", email=" + email + "]";
    }

    public static void main(String[] args) {
        Student student1 = new Student("Alice Smith", 20, "S123456", "alice.smith@example.com");
        Student student2 = new Student("Alice Smith", 20, "S654321", "alice.smith@example.com");
        Student student3 = new Student("Bob Johnson", 22, "S789012", "bob.johnson@example.com");

        System.out.println("student1 equals student2: " + student1.equals(student2));
        System.out.println("student1 equals student3: " + student1.equals(student3));

        System.out.println("student1 hashCode: " + student1.hashCode());
        System.out.println("student2 hashCode: " + student2.hashCode());
        System.out.println("student3 hashCode: " + student3.hashCode());

        System.out.println("student1 and student2 have the same hashCode: " + (student1.hashCode() == student2.hashCode()));
    }
}