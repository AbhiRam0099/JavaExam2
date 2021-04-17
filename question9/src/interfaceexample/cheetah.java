/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaceexample;

/**
 *
 * @author Abhilash Ramavaram
 */
 class cheetah implements cornivorusAnimal {

     int speed;
     int power;
     
     
    @Override
    public void attackSpeed(int a) {
          speed = a;
          
          System.out.println("The attacking spped of Cheetah in kmph is : "+speed);

     
    }

    @Override
    public void strength(int b) {

      power =b;
      
      System.out.println("The paw power of Cheetah in pounds is : "+power);


    }
    
}
