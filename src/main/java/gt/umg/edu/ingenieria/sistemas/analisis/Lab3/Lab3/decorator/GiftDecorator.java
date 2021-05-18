package gt.umg.edu.ingenieria.sistemas.analisis.Lab3.Lab3.decorator;
import gt.umg.edu.ingenieria.sistemas.analisis.Lab3.Lab3.tree.IChristmasTree;

/**
 * 
 */
public class GiftDecorator extends ChristmasTreeDecorator {

    /**
     * Default constructor
     */
    public GiftDecorator(IChristmasTree decoratedChristmasTree) {
        super(decoratedChristmasTree);
    }

    @Override
    public void place() {
        super.place();
        addGift(decoratedChristmasTree);
    }

    /**
     * @param christmasTree
     */
    public void addGift(IChristmasTree christmasTree) {
        // TODO implement here
        System.out.println("Decorando Arbol con Regalos");
    }

}