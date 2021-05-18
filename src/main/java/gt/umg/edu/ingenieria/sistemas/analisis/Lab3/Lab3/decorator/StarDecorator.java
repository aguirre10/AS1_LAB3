package gt.umg.edu.ingenieria.sistemas.analisis.Lab3.Lab3.decorator;
import gt.umg.edu.ingenieria.sistemas.analisis.Lab3.Lab3.tree.IChristmasTree;

/**
 * 
 */
public class StarDecorator extends ChristmasTreeDecorator {

    /**
     * Default constructor
     */
    public StarDecorator(IChristmasTree decoratedChristmasTree) {
        super(decoratedChristmasTree);

    }

    @Override
    public void place() {
        super.place();
        addStar(decoratedChristmasTree);
    }

    /**
     * @param christmasTree
     */
    public void addStar(IChristmasTree christmasTree) {
        // TODO implement here
        System.out.println("Decorando árbol con estrella");
    }

}