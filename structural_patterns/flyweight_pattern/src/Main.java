public class Main {
    public static void main(String[] args) {

        Book book = new Book("Book title", "author", BookTypeFactory.getBookType("type", "otherData"));

        System.out.println(book);

    }
}