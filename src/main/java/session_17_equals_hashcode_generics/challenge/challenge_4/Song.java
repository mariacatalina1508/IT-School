package session_17_equals_hashcode_generics.challenge.challenge_4;

import java.util.Objects;

public class Song {


    private String title;
    private String artist;
    private int length;

    public Song(String title, String artist, int length) {
        this.title = title;
        this.artist = artist;
        this.length = length;
    }

    public String getTitle() {
        return title;
    }

    public String getArtist() {
        return artist;
    }

    public int getLength() {
        return length;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass())
            return false;
        Song song = (Song) obj;
        return Objects.equals(title, song.title) && Objects.equals(artist, song.artist);
    }

    // Override hashCode() method
    @Override
    public int hashCode() {
        return Objects.hash(title, artist);
    }

    @Override
    public String toString() {
        return "Song [title=" + title + ", artist=" + artist + ", length=" + length + " seconds]";
    }

    public static void main(String[] args) {
        Song song1 = new Song("Fortnight", "Taylor Swift", 190);
        Song song2 = new Song("Fortnight", "Taylor Swift", 270);
        Song song3 = new Song("Hey Jude", "The Beatles", 490);

        System.out.println("song1 equals song2: " + song1.equals(song2));
        System.out.println("song1 equals song3: " + song1.equals(song3));

        System.out.println("song1 hashCode: " + song1.hashCode());
        System.out.println("song2 hashCode: " + song2.hashCode());
        System.out.println("song3 hashCode: " + song3.hashCode());

        System.out.println("song1 and song2 have the same hashCode: " + (song1.hashCode() == song2.hashCode()));
    }
}