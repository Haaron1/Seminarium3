package se.kth.iv1350.pos.startup;
import se.kth.iv1350.pos.controller.Controller;
import se.kth.iv1350.pos.view.View;

/**
 *
 * @author Haron Osman
 */
public class Main {
    public static void main(String[] args){
        Controller contr = new Controller();
        View view = new View(contr);
        view.runFakeExecution();
    } 
}
