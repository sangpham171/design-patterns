import java.util.HashMap;
import java.util.Map;

public class BookTypeFactory {
    private static final Map<String, BookType> bookTypes = new HashMap<>();

    public static BookType getBookType(String type, String otherData) {
        BookType bookType = bookTypes.get(type);
        if (bookType == null) {
            bookType = new BookType(type, otherData);
            bookTypes.put(type, bookType);
        }
        return bookType;
    }
}
