/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question7b;

/**
 *
 * @author Abhilash Ramavaram
 */
public enum Pens{

    /**
     *
     */
    BALLPEN(36.5), NORMALPEN(27.0);
    private double price;
    

    private Pens(double price) {
        this.price = price;
        
    }

    public double getPrice() {
        return price;
    }

    
}
