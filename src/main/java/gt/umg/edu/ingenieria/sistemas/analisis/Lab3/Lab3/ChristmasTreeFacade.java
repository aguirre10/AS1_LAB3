package gt.umg.edu.ingenieria.sistemas.analisis.Lab3.Lab3;
import gt.umg.edu.ingenieria.sistemas.analisis.Lab3.Lab3.decorator.*;
import gt.umg.edu.ingenieria.sistemas.analisis.Lab3.Lab3.tree.*;

import java.util.*;

/**
 * 
 */
public class ChristmasTreeFacade {

    ChristmasTreeFactory christmasTreeFactory = new ChristmasTreeFactory();
    //private List<IChristmasTree> christmasTrees;
    /**
     * Default constructor
     */

   public ChristmasTreeFacade() {
       //this.christmasTrees = new LinkedList<>;
    }
    public void placeBalsamFir()
    {
        IChristmasTree christmasTree1 = christmasTreeFactory.getChristmasTree(ChristmasTree.BalsamFirTree);
        christmasTree1.place();
        IChristmasTree snowBalsamFir = new SnowDecorator(new BalsamFirTree());
        snowBalsamFir.place();
        System.out.println("Colocando Arbol Decorado \n");
    }

    public void placeFraserFirTree() {
        IChristmasTree christmasTree2 = christmasTreeFactory.getChristmasTree(ChristmasTree.FraserFirTree);
        christmasTree2.place();
        IChristmasTree giftFraserFir = new GiftDecorator(new FraserFirTree());
        giftFraserFir.place();
        System.out.println("Colocando Arbol Decorado \n");
    }


    public void placeNobleFirTree() {
        // TODO implement here
        IChristmasTree christmasTree3 = christmasTreeFactory.getChristmasTree(ChristmasTree.NobleFirTree);
        christmasTree3.place();
        IChristmasTree lightsNobleFir = new LightsDecorator(new NobleFirTree());
        lightsNobleFir.place();
        System.out.println("Colocando Arbol Decorado \n");

    }

    public void placeScotchPine() {
        IChristmasTree christmasTree4 = christmasTreeFactory.getChristmasTree(ChristmasTree.ScotchPine);
        christmasTree4.place();
        IChristmasTree starScotchPine = new StarDecorator(new ScotchPine());
        starScotchPine.place();
        System.out.println("Colocando Arbol Decorado \n");
    }

    public void placeWhitePine() {
        IChristmasTree christmasTree5 = christmasTreeFactory.getChristmasTree(ChristmasTree.WhitePine);
        christmasTree5.place();
        IChristmasTree bombWhitePine = new BombDecorator(new WhitePine());
        bombWhitePine.place();
        System.out.println("Colocando Arbol Decorado \n");
    }


    /*public void place() {

    }*/

}