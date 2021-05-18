package gt.umg.edu.ingenieria.sistemas.analisis.Lab3.Lab3;

import gt.umg.edu.ingenieria.sistemas.analisis.Lab3.Lab3.tree.*;

/**
 * 
 */
public class ChristmasTreeFactory {

    /**
     * @param christmasTreeType
     * @return
     */
    public IChristmasTree getChristmasTree(ChristmasTree christmasTreeType) {

        switch (christmasTreeType)
        {
            case BalsamFirTree:
                return new BalsamFirTree();

            case FraserFirTree:
                return new FraserFirTree();

            case  NobleFirTree:
                return new NobleFirTree();

            case ScotchPine:
                return new ScotchPine();

            case WhitePine:
                return new WhitePine();

        }
        return null;

    }


}