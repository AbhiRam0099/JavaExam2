/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritence;

/**
 *
 * @author Abhilash Ramavaram
 */
public class Inheritence {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
            One hippo = new Three();
    hippo.guess(4);
   hippo.apply(12);

    One lion = new One(-1);
    System.out.println(lion.guess(5));
    System.out.println(lion.apply(6));        

    }
    
}
