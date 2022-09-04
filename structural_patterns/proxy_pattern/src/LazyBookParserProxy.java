public class LazyBookParserProxy implements IBookParser {
    private String bookName;
    private BookParser bookParser;

    public LazyBookParserProxy(String bookName) {
        this.bookName = bookName;
    }

    public void parse() {
        instantiateBookParser();
        this.bookParser.parse();
    }

    private void instantiateBookParser() {
        if (this.bookParser == null)
            this.bookParser = new BookParser(this.bookName);
    }
}
