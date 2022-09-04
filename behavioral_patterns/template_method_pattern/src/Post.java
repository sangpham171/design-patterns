public class Post extends Record {
    private String title;

    public Post(String title) {
        this.title = title;
    }

    @Override
    public void beforeSave() {
        System.out.println("Before save post " + title);
    }

    @Override
    public void afterSave() {
        System.out.println("After save post " + title);
    }

    @Override
    public void failSave() {
        System.out.println("Fail save post " + title);
    }
}
