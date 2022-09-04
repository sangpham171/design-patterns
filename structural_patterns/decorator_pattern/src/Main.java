import components.DecorativeTree;
import components.ChristmasTree;
import decorators.BubbleLight;
import decorators.Ribbon;
import decorators.Star;

public class Main {
    public static void main(String[] args) {
        DecorativeTree christmasTree = new ChristmasTree();
        System.out.println(christmasTree.decorate());

        christmasTree = new Ribbon(christmasTree);
        System.out.println(christmasTree.decorate());

        christmasTree = new Star(christmasTree);
        System.out.println(christmasTree.decorate());

        christmasTree = new BubbleLight(christmasTree);
        System.out.println(christmasTree.decorate());

    }
}