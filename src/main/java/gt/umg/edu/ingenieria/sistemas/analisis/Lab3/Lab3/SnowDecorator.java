package gt.umg.edu.ingenieria.sistemas.analisis.Lab3.Lab3;
import java.util.*;

/**
 * 
 */
public class SnowDecorator extends ChristmasTreeDecorate {

    /**
     * Default constructor
     * @param balsamFirTree
     */
    public SnowDecorator(IChristmasTree decoratedChristmasTree) {
        super(decoratedChristmasTree);
    }
    @Override
    public void place() {
        decoratedChristmasTree.place();
        setChristmasTree(decoratedChristmasTree);
    }

    private void setChristmasTree(IChristmasTree decoratedChristmasTree) {
        System.out.println("Arbol con Nieve");
    }


    /**
     * @param christmasTree
     */
    public void addSnow(IChristmasTree christmasTree) {
        // TODO implement here
    }

}