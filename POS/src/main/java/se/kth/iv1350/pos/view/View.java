package se.kth.iv1350.pos.view;
import se.kth.iv1350.pos.controller.Controller; 
import se.kth.iv1350.pos.DTO.SoldItemDTO; 
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
        
        SoldItemDTO foundItem = contr.searchMatchingItem(1);
        System.out.println("Item has been found: " + foundItem);
        foundItem = contr.searchMatchingItem(7);
        System.out.println("Invalid item identifier: " + foundItem);
    }
}
