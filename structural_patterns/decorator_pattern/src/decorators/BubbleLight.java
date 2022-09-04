package decorators;

import components.DecorativeTree;

public class BubbleLight extends TreeDecorator {
    public BubbleLight(DecorativeTree decorativeTree) {
        super(decorativeTree);
    }

    @Override
    public String decorate() {
        return super.decorate() + " with a bubble light";
    }
}
