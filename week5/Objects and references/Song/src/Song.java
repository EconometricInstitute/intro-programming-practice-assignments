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

    @Override
    public boolean equals(Object compared) {
        if (this == compared) {
            return true;
        }
        
        if (!(compared instanceof Song)) {
            return false;
        }
        
        Song otherSong = (Song) compared;
        
        if (this.title.equals(otherSong.title) && this.author.equals(otherSong.author) && this.length == otherSong.length) {
            return true;
        }
        
        return false;
    }
}
