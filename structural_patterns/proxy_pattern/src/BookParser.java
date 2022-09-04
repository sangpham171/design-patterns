public class BookParser implements IBookParser {
    private String bookName;

    public BookParser(String bookName) {
        // expensive operation
        this.bookName = bookName;
    }

    public void parse() {
        System.out.println("Parsing the book " + this.bookName);
    }
}
