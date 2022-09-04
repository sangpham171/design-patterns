package view;

import resources.IResource;

import java.util.List;

public class ShortFormView extends View {
    private IResource resource;

    public ShortFormView() {
    }

    public String show() {
        List<IResource> resourceList = getResources();

        String result = "ShortForm: \n";
        for (IResource resource : resourceList) {
            result += resource.title() +"\n";
        }
        return result;
    }
}
