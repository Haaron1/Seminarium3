package se.kth.iv1350.pos.integration;
import java.util.ArrayList;
import java.util.List;
import se.kth.iv1350.pos.DTO.ItemDTO;

/**
 *
 * @author Haron Osman
 */
public class InventorySystem {
    private final List<ItemDTO> items = new ArrayList<>();
    /*
    *
    */
    public InventorySystem(){
        addItems();
    }
    /*
    *Searches for specified item in the list of items in inventory system
    */
    public ItemDTO findItem(int itemId){
        for(ItemDTO item : items){
            if(item.getItemId() == itemId){
                return item;
            }
        }
        return null; 
    }
    
    private void addItems(){
        items.add(new ItemDTO(1, 19.99, "Apple"));
        items.add(new ItemDTO(2, 16.95, "Milk"));
        items.add(new ItemDTO(3, 19.99, "Juice"));
        items.add(new ItemDTO(4, 19.99, "Carrot"));
        items.add(new ItemDTO(5, 19.99, "Banana"));
    }
}
