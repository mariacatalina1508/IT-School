package session_10_oop_concepts.challenge;

public class Courses {

    String duration;
    String schedule;
    String description;

    public Courses(String duration, String schedule, String description) {
        this.duration = duration;
        this.schedule = schedule;
        this.description = description;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public String getSchedule() {
        return schedule;
    }

    public void setSchedule(String schedule) {
        this.schedule = schedule;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
