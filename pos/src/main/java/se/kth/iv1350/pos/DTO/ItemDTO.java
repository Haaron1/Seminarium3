package se.kth.iv1350.pos.DTO;
import java.lang.String;
/**
 *
 * @author Haron Osman
 */
public class ItemDTO {
    private int itemId;
    private double price;
    private String name;
    private double taxRate;
    public ItemDTO(int itemId, double price, String name, double taxRate){
        this.itemId = itemId;
        this.price = price;
        this.name = name;
        this.taxRate = taxRate;
        
    }
    /*
    *Method to retrieve the price of an item
    */
    public double getPrice(){
        return price;
    }
    
    /*
    *Method to retrieve the id of an item
    */
    public int getItemId(){
        return itemId;
    }
    
    /*
    *Method to retrieve the name of an item
    */
    public String getName(){
        return name;
    }
    
    public double getTaxRate(){
        return taxRate;
    }
}
