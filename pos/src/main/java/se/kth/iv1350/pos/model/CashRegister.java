/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package se.kth.iv1350.pos.model;

/**
 *
 * @author Haron Osman
 */
public class CashRegister {
    private double balance;
    public void addPayment(CashPayment payment){
        balance += payment.getTotalPrice();
    }
}
