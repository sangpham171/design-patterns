public class Todo implements TodoList {
    private String text;

    public Todo (String text) {
        this.text = text;
    }

    public String getHtml() {
        return String.format("<li>%s</li>", text);
    }
}
