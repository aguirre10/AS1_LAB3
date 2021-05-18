package gt.umg.edu.ingenieria.sistemas.analisis.Lab3.Lab3;
import gt.umg.edu.ingenieria.sistemas.analisis.Lab3.Lab3.decorator.*;
import gt.umg.edu.ingenieria.sistemas.analisis.Lab3.Lab3.tree.*;

import java.util.*;

import static java.lang.Math.random;

/**
 * 
 */
public class ChristmasTreeFacade {

    private ChristmasTreeFactory christmasTreeFactory;
    private List<IChristmasTree> christmasTrees;
    /**
     * Default constructor
     */

   public ChristmasTreeFacade() {
       this.christmasTrees = new LinkedList();
       this.christmasTreeFactory = new ChristmasTreeFactory();
    }

    public void fillChristmasTrees(int n){

      for (int i= 0;i<n;i++)
      {
          IChristmasTree christmasTree1 = this.christmasTreeFactory.getChristmasTree(this.getRandomTreeType());

          this.christmasTrees.add(christmasTree1);
      }


    }

    public ChristmasTree getRandomTreeType()
    {
        double randomNumber = Math.random();
        if (randomNumber >=0.0 && randomNumber<0.2)
        {
            return ChristmasTree.BalsamFirTree;
        }
        if (randomNumber >=0.2 && randomNumber<0.4)
        {
            return ChristmasTree.FraserFirTree;
        }
        if (randomNumber >=0.4 && randomNumber<0.6)
        {
            return ChristmasTree.NobleFirTree;
        }
        if (randomNumber >=0.6 && randomNumber<0.8)
        {
            return ChristmasTree.ScotchPine;
        }

            return ChristmasTree.WhitePine;
    }

    public void decorateChristmasTrees(){
       for(IChristmasTree tree: this.christmasTrees)
       {
           ChristmasTreeDecorator snowBalsamFirDecorator = new SnowDecorator(tree);
           snowBalsamFirDecorator.cut();
           snowBalsamFirDecorator.place();
       }

    }

}