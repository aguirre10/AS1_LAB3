package gt.umg.edu.ingenieria.sistemas.analisis.Lab3.Lab3;
import java.util.*;
import java.util.ArrayList;

/**
 * 
 */
public class ChristmasTreeFacade {

    private IChristmasTree balsamFir;
    private IChristmasTree fraserFir;
    private IChristmasTree nobleFir;
    private IChristmasTree scotchPine;
    private IChristmasTree whitePine;
    /**
     * Default constructor
     */
    public ChristmasTreeFacade() {
    }

    /**
     * 
     */


    /**
     * 
     */
    public void christmasTreeMaker() {
        BalsamFirTree balsamFir = new BalsamFirTree();
        FraserFirTree fraserFir =  new FraserFirTree();
        NobleFirTree nobleFir  =  new NobleFirTree();
        ScotchPine scotchPine =  new ScotchPine();
        WhitePine whitePine =  new WhitePine();


    }

    /**
     * @return
     */
    public void placeBalsamFirTree() {

        // TODO implement here
       balsamFir.place();
    }

    /**
     * @return
     */
    public void placeFraserFirTree() {
        // TODO implement here
        fraserFir.place();
    }

    /**
     * @return
     */
    public void placeNobleFirTree() {
        // TODO implement here
        nobleFir.place();

    }

    /**
     * @return
     */
    public void placeWhitePine() {
        whitePine.place();
    }

    /**
     * @return
     */
    public void placeScotchPine() {
        scotchPine.place();


    }

    /**
     * 
     */
    public void place() {

    }

}