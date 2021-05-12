package gt.umg.edu.ingenieria.sistemas.analisis.Lab3.Lab3;
import java.util.*;

/**
 * 
 */
public class ChristmasTreeApp {

    private static gt.umg.edu.ingenieria.sistemas.analisis.Lab3.Lab3.BalsamFirTree BalsamFirTree;

    /**
     * Default constructor
     */
    public ChristmasTreeApp() {
    }

    /**
     * @param args
     */
    public static void main(String[] args) {
        // TODO implement here
        ChristmasTreeFactory christmasTreeFactory = new ChristmasTreeFactory();
        ChristmasTreeFacade christmasTreeFacade  = new ChristmasTreeFacade();


        IChristmasTree christmasTree1 = christmasTreeFactory.getChristmasTree("BALSAM FIR");
        christmasTree1.place();


        IChristmasTree christmasTree2 = christmasTreeFactory.getChristmasTree("FRASER FIR");
        christmasTree2.place();


        IChristmasTree christmasTree3 = christmasTreeFactory.getChristmasTree("BALSAM FIR");
        christmasTree3.place();


        IChristmasTree christmasTree4 = christmasTreeFactory.getChristmasTree("SCOTCH PINE");
        christmasTree4.place();


        IChristmasTree christmasTree5 = christmasTreeFactory.getChristmasTree("WHITE PINE");
        christmasTree5.place();

        IChristmasTree balsamFir = new BalsamFirTree();
        IChristmasTree snowBalsamFir = (IChristmasTree) new SnowDecorator(new BalsamFirTree());

        System.out.println("Creando Arbol");
        balsamFir.place();

        System.out.println("Arbol BalsamFir con Nieve");
        snowBalsamFir.place();


        christmasTreeFacade.placeBalsamFirTree();
        christmasTreeFacade.placeFraserFirTree();
        christmasTreeFacade.placeNobleFirTree();
        christmasTreeFacade.placeScotchPine();
        christmasTreeFacade.placeWhitePine();
    }

}