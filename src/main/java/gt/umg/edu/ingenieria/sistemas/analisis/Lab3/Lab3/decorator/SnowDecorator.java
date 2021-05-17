package gt.umg.edu.ingenieria.sistemas.analisis.Lab3.Lab3.decorator;
import gt.umg.edu.ingenieria.sistemas.analisis.Lab3.Lab3.tree.IChristmasTree;

/**
 * 
 */
public class SnowDecorator extends ChristmasTreeDecorator {


    public SnowDecorator(IChristmasTree decoratedChristmasTree) {
        super(decoratedChristmasTree);
    }
    @Override
    public void place() {
      //  decoratedChristmasTree.place();
        addSnow(decoratedChristmasTree);

    }

    /**
     * @param decoratedChristmasTree
     */
    public void addSnow(IChristmasTree decoratedChristmasTree) {
        // TODO implement here
        System.out.println("Decorando Arbol con Nieve");
    }

}