package se.kth.iv1350.pos.view;
import se.kth.iv1350.pos.controller.Controller; 
/**
 *
 * @author Haron Osman
 */
public class View {
    private Controller contr;
    
    public View(Controller contr){
        this.contr = contr;
    }
    /**
    *
    */
    public void runFakeExecution(){
        contr.startSale();
        System.out.println("A new sale has been started.");
        
        contr.searchMatchingItem(1);
        System.out.println("Item has been found");
        contr.searchMatchingItem(7);
        System.out.println("Invalid item identifier");
    }
}
