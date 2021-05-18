package gt.umg.edu.ingenieria.sistemas.analisis.Lab3.Lab3.decorator;
import gt.umg.edu.ingenieria.sistemas.analisis.Lab3.Lab3.tree.IChristmasTree;

/**
 * 
 */
public abstract class ChristmasTreeDecorator implements IChristmasTree{

    /**
     * Default constructor
     */
    protected IChristmasTree decoratedChristmasTree;

    public ChristmasTreeDecorator(IChristmasTree decoratedChristmasTree) {
        this.decoratedChristmasTree = decoratedChristmasTree;

    }


    public void place() {
         this.decoratedChristmasTree.place();
        // TODO implement here
    }

    @Override
    public void cut() {
        this.decoratedChristmasTree.cut();
    }
}