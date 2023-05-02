/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package se.kth.iv1350.pos.model;
import java.util.ArrayList;
import java.util.List;
import se.kth.iv1350.pos.DTO.SoldItemDTO;
import se.kth.iv1350.pos.DTO.ItemDTO;

/**
 *
 * @author Haron Osman
 */
public class Sale {
    private List<SoldItem> purchasedItems;
    private SoldItemDTO soldItemInfo;
    private double totalPrice;
    
    public Sale(){
        purchasedItems = new ArrayList<>();
    }
    /*
    *Calculates running total and creates a new object with additional info
    */
    public SoldItemDTO calculateRunningTotal(ItemDTO foundItem){
        double runningTotal = foundItem.getPrice() + foundItem.getPrice() * foundItem.getTaxRate();
        soldItemInfo = new SoldItemDTO(foundItem, runningTotal);
        return soldItemInfo;
    }
    
    public SoldItem calculateQuantity(int amount ){
        SoldItem item = new SoldItem(soldItemInfo, amount);
        addItem(item);
        return item;
    }
    
    public SoldItemDTO findListedItem(int itemId){
        for(SoldItem item : purchasedItems){
            if(item.getItemId() == itemId){
                item.increaseQuantity(1);
                return item.getItemData();
            }
        }
        return null;
    }
    public double calculateTotalSum(){
        for(SoldItem item : purchasedItems){
            totalPrice += item.getQuantity() * item.getRunningTotal();
        }
        return totalPrice;
    }
    
    private void addItem(SoldItem item){
        purchasedItems.add(item);
    } 
    
}
