package gt.umg.edu.ingenieria.sistemas.analisis.Lab3.Lab3.decorator;
import gt.umg.edu.ingenieria.sistemas.analisis.Lab3.Lab3.tree.IChristmasTree;

/**
 * 
 */
public class BombDecorator extends ChristmasTreeDecorator {

    /**
     * Default constructor
     */
    public BombDecorator(IChristmasTree decoratedChristmasTree) {
        super(decoratedChristmasTree);
    }

    @Override
    public void place() {
        super.place();
        addBomb(decoratedChristmasTree);
    }

    /**
     * @param christmasTree
     */
    public void addBomb(IChristmasTree christmasTree) {
        // TODO implement here
        System.out.println("Decorando Arbol con Bombas");
    }

}