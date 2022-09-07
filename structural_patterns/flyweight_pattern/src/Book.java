public class Book {
    private String title;
    private String author;
    private BookType type;

    public Book(String title, String author, BookType type) {
        this.title = title;
        this.author = author;
        this.type = type;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public BookType getType() {
        return type;
    }

    @Override
    public String toString() {
        return "Book{" + "title=" + title + ", author=" + author + ", type=" + type + '}';
    }
}
