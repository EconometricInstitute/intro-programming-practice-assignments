import java.util.Objects;

public class Song {
    private String title;
    private String author;
    private int length;

    public Song(String title, String author, int length) {
        this.title = title;
        this.author = author;
        this.length = length;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getLength() {
        return length;
    }

    // Add the equals method here
}
