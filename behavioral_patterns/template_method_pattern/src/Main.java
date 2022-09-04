public class Main {
    public static void main(String[] args) {
        Record post = new Post("Post title");
        Record user = new User("User name");
        post.save();
        user.save();
    }
}