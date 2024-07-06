package session_10_oop_concepts.challenge;

public class CollegeManagement {

    public static void main(String[] args) {
        StudentProfile student = new StudentProfile("John", "Abe", 24, "Male", "2000-12-12", 1943658751423L, "Saint Cloud MN 56301-4498\n" +
                "USA ");
        StudentProfile professor = new StudentProfile("Aiden", "Aben", 24, "Male", "2000-11-11", 1856236457812L, "Lafayette IN 47904-2198\n" +
                "USA ");

        Courses math = new Courses("1h:50min", "Monday 09am", "Math Courses");
        System.out.println(math.description + " " + math.schedule + " " + math.duration + " " + professor.firstName + " " + professor.lastName);

        Courses biology = new Courses("1h:50min", "Monday 08am", "Biology Courses");
        System.out.println(biology.description + " " + biology.schedule + " " + biology.duration + " " + professor.firstName + " " + professor.lastName);
    }

}
