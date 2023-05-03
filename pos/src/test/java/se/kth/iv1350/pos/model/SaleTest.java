/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package se.kth.iv1350.pos.model;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import se.kth.iv1350.pos.DTO.ItemDTO;

/**
 *
 * @author Haron Osman
 */
public class SaleTest {
    
    public SaleTest() {
    }

    @org.junit.jupiter.api.BeforeAll
    public static void setUpClass() throws Exception {
    }

    @org.junit.jupiter.api.AfterAll
    public static void tearDownClass() throws Exception {
    }

    @org.junit.jupiter.api.BeforeEach
    public void setUp() throws Exception {
    }

    @org.junit.jupiter.api.AfterEach
    public void tearDown() throws Exception {
    }

    

    /**
     * Test of itemToCart method, of class Sale.
     */
    @org.junit.jupiter.api.Test
    public void testItemToCart() {
        System.out.println("itemToCart");
        ItemDTO foundItem = null;
        Sale instance = new Sale();
        SoldItem expResult = null;
        SoldItem result = instance.itemToCart(foundItem);
        assertEquals(expResult, result);
    }

    /**
     * Test of findListedItem method, of class Sale.
     */
    @org.junit.jupiter.api.Test
    public void testFindListedItem() {
        System.out.println("findListedItem");
        int itemId = 0;
        Sale instance = new Sale();
        SoldItem expResult = null;
        SoldItem result = instance.findListedItem(itemId);
        assertEquals(expResult, result);
    }

    /**
     * Test of calculateTotalSum method, of class Sale.
     */
    @org.junit.jupiter.api.Test
    public void testCalculateTotalSum() {
        System.out.println("calculateTotalSum");
        Sale instance = new Sale();
        double expResult = 0.0;
        double result = instance.calculateTotalSum();
        assertEquals(expResult, result, 0);
    }
    
}
