package decorators;

import components.DecorativeTree;

public class Star extends TreeDecorator {
    public Star(DecorativeTree decorativeTree) {
        super(decorativeTree);
    }

    @Override
    public String decorate() {
        return super.decorate() + " with a star";
    }
}
