/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question4a;

/**
 *
 * @author Abhilash Ramavaram
 */
class Caluclator {
   int cal;
	
   public void addition(int a, int b) {
      cal = a+ b;
      System.out.println("The sum of the given numbers : "+cal);
   }
	
   public void Subtraction(int a, int b) {
      cal = a - b;
      System.out.println("The difference between the given numbers : "+cal);
   }
}

public class Calculation extends Caluclator {
   public void multiplication(int a, int b) {
      cal = a * b;
      System.out.println("The product of the given numbers : "+cal);
   }
   public static void main(String args[]) {
      int a = 30, b = 20;
      Calculation c = new Calculation();
      c.addition(a, b);
      c.Subtraction(a, b);
      c.multiplication(a, b);
   }
}

