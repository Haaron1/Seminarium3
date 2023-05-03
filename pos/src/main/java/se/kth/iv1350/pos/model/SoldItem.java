/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package se.kth.iv1350.pos.model;
import se.kth.iv1350.pos.DTO.ItemDTO;
/**
 *
 * @author Haron Osman
 */
public class SoldItem {
    private int quantity;
    private double runningTotal;
    
    private ItemDTO soldItemData;
    
    /**
     * 
     * @param foundItem
     * @param runningTotal 
     */
    public SoldItem(ItemDTO foundItem, double runningTotal){
        this.quantity = 1;
        this.runningTotal = runningTotal;
        
        
        soldItemData = foundItem;
    }
    
    public void increaseQuantity(){
        quantity++;
    }
    
    public String getName(){
        return soldItemData.getName();
    }
    
    public int getItemId(){
        return soldItemData.getItemId();
    }
    
    public double getRunningTotal(){
        return getUnitRunningTotal() * getQuantity();
    }
    
    public double getUnitRunningTotal(){
        return runningTotal;
    }
    
    public double getPrice(){
        return getUnitPrice() * getQuantity();
    }
    public double getUnitPrice(){
        return soldItemData.getPrice();
    }
    
    public int getQuantity(){
        return quantity;
    }
    
    public double getTaxRate(){
        return soldItemData.getTaxRate();
    }
    
    public ItemDTO getItemData(){
        return soldItemData;
    }
    
}
