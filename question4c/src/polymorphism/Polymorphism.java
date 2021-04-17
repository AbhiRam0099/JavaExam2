/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polymorphism;

/**
 *
 * @author Abhilash Ramavaram
 */
public class Polymorphism {
    
    public static void main(String[] args)
    {
  
       
  
    Parent a = new subclass1();
        a.Print();
  
     Parent   b = new subclass2();
        b.Print();
    }

   
 class Parent {
  
    void Print()
    {
        System.out.println("parent class");
    }
}
  
class subclass1 extends Parent {
  
    void Print()
    {
        System.out.println("subclass1");
    }
}
  
class subclass2 extends Parent {
  
    void Print()
    {
        System.out.println("subclass2");
    }
}
  

  
}
    

