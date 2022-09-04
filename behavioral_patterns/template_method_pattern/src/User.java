public class User extends Record {
    private String name;

    public User(String name) {
        this.name = name;
    }

    @Override
    public void beforeSave() {
        System.out.println("Before save user " + name);
    }

    @Override
    public void afterSave() {
        System.out.println("After save user " + name);
    }

    @Override
    public void failSave() {
        System.out.println("Fail save user " + name);
    }
}
