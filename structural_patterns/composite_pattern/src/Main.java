import java.util.List;

public class Main {
    public static void main(String[] args) {

        TodoList todoList1 = new Todo("Todo 1");
        List<TodoList> todoLists = List.of(new Todo("Todo 2"),new Todo("Todo 3"));
        TodoList project1 = new Project("Project 1", todoLists);

        System.out.println("todoList1: \n" + todoList1.getHtml());
        System.out.println("project1: \n"+ project1.getHtml());

    }
}