/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question4b;

/**
 *
 * @author Abhilash Ramavaram
 */
public class Question4b {

    /**
     * @param args the command line arguments
     */
   /**
 *
 * @author Abhilash Ramavaram
 */


  void Address(int areaPin, String streetName) 
  { 
    
    System.out.println("My Address is: " +areaPin +","+streetName); 
  } 
void Address(int areaPin, String streetName,String cityName,String stateName) 
{ 
   System.out.println("My fullAddress is: " +areaPin +","+streetName +","+cityName+","+stateName); 
  } 
public static void main(String[] args) 
{ 
  Question4b ad = new Question4b(); 
   ad.Address(64468, "NCollegeDrive"); 
   ad.Address(64468, "NCollegeDrive","Maryville","Missouri"); 
  } 
}


