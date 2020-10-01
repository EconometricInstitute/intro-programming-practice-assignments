public class Book {
    private String title;
    private int year;

    public Book(String title, int year) {
        this.title = title;
        this.year = year;
    }

    public boolean equals(Object compared) {
        if (this == compared) {
            return true;
        }

        if (!(compared instanceof Book)) {
            return false;
        }

        Book otherBook = (Book) compared;

        if (this.title.equals(otherBook.title) && this.year == otherBook.year) {
            return true;
        }
        
        return false;
    }
}
