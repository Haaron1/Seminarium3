package se.kth.iv1350.pos.controller;
import se.kth.iv1350.pos.integration.AccountingSystem;
import se.kth.iv1350.pos.integration.InventorySystem;
import se.kth.iv1350.pos.integration.DiscountRegister;
import se.kth.iv1350.pos.integration.Printer;
import se.kth.iv1350.pos.model.CashRegister;
import se.kth.iv1350.pos.model.Sale;
import se.kth.iv1350.pos.model.SoldItem;
import se.kth.iv1350.pos.DTO.ItemDTO;
import se.kth.iv1350.pos.DTO.SoldItemDTO;

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
    
    public void startSale(){
        currentSale = new Sale();
    }
    
    public SoldItemDTO searchMatchingItem(int itemId){
        SoldItemDTO soldItemInfo = currentSale.findListedItem(itemId);
        if(soldItemInfo != null){
            return soldItemInfo;
        }
        ItemDTO foundItem = invSys.findItem(itemId);
        if(foundItem == null){
            return null; //if no item is found then no item can be sold
        }
        soldItemInfo = currentSale.calculateRunningTotal(foundItem);
        return soldItemInfo; //should return some info about the soldItem
    }
    
    public SoldItem specifyQuantity(int amount){
        SoldItem soldItem = currentSale.calculateQuantity(amount);
        return soldItem;
    }
    
    public double endSale(){
        double totalPrice = currentSale.calculateTotalSum();
        return totalPrice;
    }
    
    
    
}
