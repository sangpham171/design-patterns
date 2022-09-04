package resources;

public class Artist {
    private String name;
    private String bio;
    private String homepage;

    public Artist(String name, String bio, String homepage) {
        this.name = name;
        this.bio = bio;
        this.homepage = homepage;
    }

    public String getName() {
        return name;
    }

    public String getBio() {
        return bio;
    }

    public String getHomepage() {
        return homepage;
    }
}
