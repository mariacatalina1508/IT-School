package session_10_oop_concepts.challenge;

public class StudentProfile {

    public String firstName;
    public String lastName;
    public int age;
    public String male;
    private String dateOfBirth;
    private long CNP;
    private String address;

    public StudentProfile(String firstName, String lastName, int age, String male, String dateOfBirth, long CNP, String address) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.male = male;
        this.dateOfBirth = dateOfBirth;
        this.CNP = CNP;
        this.address = address;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public String getMale() {
        return male;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public long getCNP() {
        return CNP;
    }

    public String getAddress() {
        return address;
    }
}
