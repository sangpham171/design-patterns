package resources;

public class Book {
    private String title;
    private String author;
    private String summary;
    private String url;

    public Book(String title, String author, String summary, String url) {
        this.title = title;
        this.author = author;
        this.summary = summary;
        this.url = url;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getSummary() {
        return summary;
    }

    public String getUrl() {
        return url;
    }
}
