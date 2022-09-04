package view;

import resources.IResource;

import java.util.List;

public class LongFormView extends View {
    public LongFormView() {
    }

    public String show() {
        List<IResource> resourceList = getResources();

        String result = "LongForm: \n";
        for (IResource resource : resourceList) {
            result += resource.title() + " " + resource.url() + " " + resource.snippet() + "\n";
        }
        return result;
    }
}
