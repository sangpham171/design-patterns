public abstract class Record {
    public void save() {
        beforeSave();
        try {
            System.out.println("Save to DB");
            afterSave();
        } catch (Exception e) {
            failSave();
        }
    }

    ;

    public abstract void beforeSave();

    public abstract void afterSave();

    public abstract void failSave();
}
