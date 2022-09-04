package decorators;

import components.DecorativeTree;

public abstract class TreeDecorator implements DecorativeTree {
    private DecorativeTree decorativeTree;

    public TreeDecorator(DecorativeTree decorativeTree) {
        this.decorativeTree = decorativeTree;
    }

    @Override
    public String decorate() {
        return decorativeTree.decorate();
    }
}
