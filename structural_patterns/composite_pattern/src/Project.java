import java.util.ArrayList;
import java.util.List;

public class Project implements TodoList {
    private String name;
    private List<TodoList> todoLists = new ArrayList<>();

    public Project(String name, List<TodoList> todoLists) {
        this.name = name;
        this.todoLists = todoLists;
    }

    @Override
    public String getHtml() {
        StringBuilder builder = new StringBuilder();
        builder.append("<h1>")
               .append(name)
               .append("</h1>\n");
        builder.append("<ul>\n");
        for (TodoList todoList : todoLists) {
            builder.append(todoList.getHtml()+"\n");
        }
        builder.append("</ul>");
        return builder.toString();
    }
}
