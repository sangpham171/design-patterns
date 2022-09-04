public class Main {
    public static void main(String[] args) {
        IBookParser bookParser = new LazyBookParserProxy("Harry Potter");
        bookParser.parse();
    }
}