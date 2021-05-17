package gt.umg.edu.ingenieria.sistemas.analisis.Lab3.Lab3;
import gt.umg.edu.ingenieria.sistemas.analisis.Lab3.Lab3.decorator.*;
import gt.umg.edu.ingenieria.sistemas.analisis.Lab3.Lab3.tree.*;

/**
 * 
 */
public class ChristmasTreeApp {

    public ChristmasTreeApp() {
    }

    /**
     * @param args
     */
    public static void main(String[] args) {
        // TODO implement here
        ChristmasTreeFacade christmasTreeFacade  = new ChristmasTreeFacade();


      christmasTreeFacade.placeBalsamFir();
      christmasTreeFacade.placeNobleFirTree();
      christmasTreeFacade.placeFraserFirTree();
      christmasTreeFacade.placeScotchPine();
      christmasTreeFacade.placeWhitePine();
    }

}