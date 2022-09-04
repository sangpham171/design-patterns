package decorators;

import components.DecorativeTree;

public class Ribbon extends TreeDecorator {
    public Ribbon(DecorativeTree decorativeTree) {
        super(decorativeTree);
    }

    @Override
    public String decorate() {
        return super.decorate() + " with a ribbon";
    }
}
