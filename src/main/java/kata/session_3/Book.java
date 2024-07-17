package kata.session_3;

import java.time.LocalDate;
import java.util.UUID;

public class Book {

    private UUID id;
    private String title;
    private String author;
    private int numberOfVolume;
    private LocalDate publishingDate;

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getNumberOfVolume() {
        return numberOfVolume;
    }

    public void setNumberOfVolume(int numberOfVolume) {
        this.numberOfVolume = numberOfVolume;
    }

    public LocalDate getPublishingDate() {
        return publishingDate;
    }

    public void setPublishingDate(LocalDate publishingDate) {
        this.publishingDate = publishingDate;
    }
}