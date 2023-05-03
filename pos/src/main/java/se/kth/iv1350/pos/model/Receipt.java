/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package se.kth.iv1350.pos.model;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;
import java.lang.String;
import java.text.DecimalFormat;
import se.kth.iv1350.pos.model.CashPayment;


/**
 *
 * @author Haron Osman
 */
public class Receipt {
    private static final DecimalFormat df = new DecimalFormat("0.00");
    private List<SoldItem> purchasedItems;
    private LocalTime saleTime;
    private CashPayment payment;
    private double totalPriceWithoutTax;
    
    
    public Receipt(CashPayment payment, List<SoldItem> purchasedItems, 
            LocalTime saleTime, double totalPriceWithoutTax){
        this.purchasedItems = purchasedItems;
        this.saleTime = saleTime;
        this.payment = payment;
        this.totalPriceWithoutTax = totalPriceWithoutTax;
    }
    
    public LocalTime getSaleTime(){
        return saleTime;
    }
    
    public String printPurchasedItems(){
        String purchasedItemsToString = "";
        for(SoldItem item : purchasedItems){
            purchasedItemsToString += item.getName() 
                    + "  " 
                    + item.getQuantity() 
                    + " x " 
                    + df.format(item.getUnitRunningTotal()) 
                    + "      " + df.format(item.getRunningTotal())
                    + "\n";
        }
        return purchasedItemsToString;
    }
    
    public double getChange(){
        return payment.getChange();
    }
    
    public double getPaidAmount(){
        return payment.getPaidAmount();
    }
    
    public double getTotalPrice(){
        return payment.getTotalPrice();
    }
    
    /**
     * Calculates the amount of tax by subtracting the total price without tax 
     * from the total price with tax
     * @return The calculated difference value 
     */
    public double getTotalTax(){
        return payment.getTotalPrice() - totalPriceWithoutTax;
    }
    
    /**
     * Calculates the tax percentage by finding the change factor of
     * total price over total price without tax, subtracting 1 from
     * the result provides the percentage in decimal form, multiplying by 100
     * gives the percentage.
     * @return The percentage of the total tax rate
     */
    public double getTotalTaxRate(){
        return 100 * ((payment.getTotalPrice() / totalPriceWithoutTax) - 1);
    }
    
    public double getTotalPriceWithoutTax(){
        return totalPriceWithoutTax;
    }
}
