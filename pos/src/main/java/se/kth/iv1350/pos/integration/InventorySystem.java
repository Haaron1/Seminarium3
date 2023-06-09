package se.kth.iv1350.pos.integration;
import java.util.ArrayList;
import java.util.List;
import se.kth.iv1350.pos.DTO.ItemDTO;

/**
 *
 * @author Haron Osman
 */
public class InventorySystem {
    private List<ItemDTO> items = new ArrayList<>();
    /**
     *
     */
    public InventorySystem(){
        addItems();
    }
    /**
     * Searches for specified item in the list of items in inventory system
     * @param itemId the specified item identifier.
     * @return The item with matching item id, or null if there is no 
     * item with matching item id.
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
        items.add(new ItemDTO(1, 9.99, "Apple", 0.12));
        items.add(new ItemDTO(2, 16.95, "Milk", 0.25));
        items.add(new ItemDTO(3, 19.99, "Juice", 0.06));
        items.add(new ItemDTO(4, 5.95, "Carrot",0.06));
        items.add(new ItemDTO(5, 4.99, "Banana",0.12));
    }
}
