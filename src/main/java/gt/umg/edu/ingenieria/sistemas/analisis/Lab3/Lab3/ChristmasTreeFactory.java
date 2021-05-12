package gt.umg.edu.ingenieria.sistemas.analisis.Lab3.Lab3;

/**
 * 
 */
public class ChristmasTreeFactory {

    /**
     * @param ChristmasTreeType
     * @return
     */
    public IChristmasTree getChristmasTree(String ChristmasTreeType) {
        if (ChristmasTreeType == null){
            return null;
        }
        if (ChristmasTreeType.equalsIgnoreCase("BALSAM FIR")){
            return new BalsamFirTree();
        }
        if (ChristmasTreeType.equalsIgnoreCase("FRASER FIR")){
            return new FraserFirTree();
        }
        if (ChristmasTreeType.equalsIgnoreCase("NOBLE FIR")){
            return new NobleFirTree();
        }
        if (ChristmasTreeType.equalsIgnoreCase("SCOTCH PINE")){
            return new ScotchPine();
        }

        if (ChristmasTreeType.equalsIgnoreCase("WHITE PINE")){
            return new WhitePine();
        }

        return null;
    }

}