package view;

import resources.IResource;

import java.util.ArrayList;
import java.util.List;

public abstract class View {
    private List<IResource> resources = new ArrayList<>();

    public View() {}

    public List<IResource> getResources() {
        return resources;
    }

    public void addResource(IResource resource) {
        resources.add(resource);
    }

    public void removeResource(IResource resource) {
        resources.remove(resource);
    }

    public abstract String show();
}
