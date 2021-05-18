package gt.umg.edu.ingenieria.sistemas.analisis.Lab3.Lab3.decorator;
import gt.umg.edu.ingenieria.sistemas.analisis.Lab3.Lab3.tree.IChristmasTree;

/**
 * 
 */
public class LightsDecorator extends ChristmasTreeDecorator {

    /**
     * Default constructor
     */
    public LightsDecorator(IChristmasTree decoratedChristmasTree) {

        super(decoratedChristmasTree);
    }

    @Override
    public void place() {
        super.place();
        addLights(decoratedChristmasTree);
    }



    /**
     * @param christmasTree
     */
    public void addLights(IChristmasTree christmasTree) {
        // TODO implement here
        System.out.println("Decorando árbol con luces");
    }

}