public class BookType {
    private String type;
    private String otherData;

    public BookType(String type, String otherData) {
        this.type = type;
        this.otherData = otherData;
    }

    public String toString() {
        return "BookType{" + "type=" + type + ", otherData=" + otherData + '}';
    }

}
