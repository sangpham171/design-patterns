package resources;

public class BookResource implements IResource {
    private Book book;

    public BookResource(Book book) {
        this.book = book;
    }

    @Override
    public String snippet() {
        return book.getSummary();
    }

    @Override
    public String title() {
        return book.getTitle();
    }

    @Override
    public String url() {
        return book.getUrl();
    }
}
