package se.kth.iv1350.pos.controller;
import se.kth.iv1350.pos.integration.AccountingSystem;
import se.kth.iv1350.pos.integration.InventorySystem;
import se.kth.iv1350.pos.integration.DiscountRegister;
import se.kth.iv1350.pos.integration.Printer;
import se.kth.iv1350.pos.model.CashRegister;
import se.kth.iv1350.pos.model.CashPayment;
import se.kth.iv1350.pos.model.Sale;
import se.kth.iv1350.pos.model.SoldItem;
import se.kth.iv1350.pos.model.Receipt;
import se.kth.iv1350.pos.DTO.ItemDTO;


/**
 *
 * @author Haron Osman
 */
public class Controller {
    private Sale currentSale;
    private AccountingSystem accSys;
    private InventorySystem invSys;
    private DiscountRegister discReg;
    private Printer printer;
    private CashRegister cashReg;
    
    public Controller(){
        accSys = new AccountingSystem();
        invSys = new InventorySystem();
        discReg = new DiscountRegister();
        printer = new Printer();
        cashReg = new CashRegister();
    }
    /**
     * Starts a new sale by creating an object for the current sale.
     */
    public void startSale(){
        currentSale = new Sale();
    }
    
    /**
     * @param itemId The item identifier of an item
     * @return The item that has been found and added to sale
     */
    public SoldItem searchMatchingItem(int itemId){
        SoldItem soldItem = currentSale.findListedItem(itemId);
        if(soldItem != null){
            
            return soldItem;
        }
        ItemDTO foundItem = invSys.findItem(itemId);
        if(foundItem == null){
            return null; //if no item is found then no item can be sold
        }
        soldItem = currentSale.itemToCart(foundItem);
        return soldItem; //should return some info about the soldItem
    }
    /**
     * Ends the sale.
     * 
     * @return The calculated total price including tax.
     */
    public double endSale(){
        return currentSale.calculateTotalSum();
    }
    
    public Receipt pay(double amount, double totalPrice){
        CashPayment payment = new CashPayment(amount, totalPrice);
        cashReg.addPayment(payment);
        Receipt receipt = currentSale.getSaleInfo(payment);
        return receipt;
    }
    
}
