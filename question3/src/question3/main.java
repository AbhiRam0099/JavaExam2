/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question3;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Abhilash Ramavaram
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
          // TODO code application logic here
        
        ArrayList<Object> loan = new ArrayList<>();
        Date d = new Date();
        Circle c = new Circle("Maryville", "MO");
        Loan l = new Loan(1122334455,1400000,12.0,20); 
        loan.add(l);
        loan.add(c);
        loan.add(d);       
        for(Object o: loan){
            
        System.out.println(o.toString());
        }
    }
    
}
