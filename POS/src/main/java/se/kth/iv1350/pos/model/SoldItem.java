/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package se.kth.iv1350.pos.model;
import java.lang.String;
import se.kth.iv1350.pos.DTO.SoldItemDTO;
/**
 *
 * @author Haron Osman
 */
public class SoldItem {
    private double price;
    private int itemId;
    private int quantity;
    private String name;
    private double runningTotal;
    private double taxRate;
    
    private SoldItemDTO soldItemData;
    
    public SoldItem(SoldItemDTO soldItemInfo, int amount){
        this.price = soldItemInfo.getPrice();
        this.itemId = soldItemInfo.getItemId();
        this.name = soldItemInfo.getName();
        this.quantity = amount;
        this.runningTotal = runningTotal;
        this.taxRate = taxRate;
        
        soldItemData = soldItemInfo;
    }
    
    public void increaseQuantity(int amount){
        quantity = quantity + amount;
    }
    
    public String getName(){
        return soldItemData.getName();
    }
    
    public int getItemId(){
        return soldItemData.getItemId();
    }
    
    public double getRunningTotal(){
        return soldItemData.getRunningTotal();
    }
    
    public double getPrice(){
        return soldItemData.getPrice();
    }
    
    public int getQuantity(){
        return quantity;
    }
    
    public SoldItemDTO getItemData(){
        return soldItemData;
    }
}
