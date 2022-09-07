public class Main {
    public static void main(String[] args) {
        Editor editor = new Editor();
        History history = new History();

        editor.setContent("new content 1");
        history.push(editor.createState());

        editor.setContent("new content 2");
        history.push(editor.createState());

        editor.setContent("new content 3");

        editor.restore(history.pop());
        System.out.println(editor.getContent());

        editor.restore(history.pop());
        System.out.println(editor.getContent());


    }
}