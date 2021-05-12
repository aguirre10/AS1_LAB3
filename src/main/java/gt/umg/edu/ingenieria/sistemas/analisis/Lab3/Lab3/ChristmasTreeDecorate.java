package gt.umg.edu.ingenieria.sistemas.analisis.Lab3.Lab3;
import java.util.*;

/**
 * 
 */
public abstract class ChristmasTreeDecorate {

    /**
     * Default constructor
     */
    protected IChristmasTree decoratedChristmasTree;

    public ChristmasTreeDecorate(IChristmasTree decoratedChristmasTree) {
        this.decoratedChristmasTree = decoratedChristmasTree;

    }

    /**
     * 
     */


    /**
     * 
     */
    public void place() {
         decoratedChristmasTree.place();
        // TODO implement here
    }

}