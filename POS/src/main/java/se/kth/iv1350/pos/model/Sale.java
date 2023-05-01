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
    private double runningTotal;
    
    public Sale(){
        purchasedItems = new ArrayList<>();
    }
    
    public void calculateRunningTotal(ItemDTO foundItem, double taxRate){
        runningTotal = foundItem.getPrice() * taxRate;
        soldItemInfo = new SoldItemDTO(foundItem, runningTotal, taxRate);
    }
    
}
