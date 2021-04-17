/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question8b;

/**
 *
 * @author Abhilash Ramavaram
 */
public class School extends HighSchool {
    private String headmaster;
    private int noOfFaulty;

    public School(String headmaster, int noOfFaulty) {
        this.headmaster = headmaster;
        this.noOfFaulty = noOfFaulty;
    }
    
 
    public double BudgetToFaculty() {
       return 2000*this.noOfFaulty;
    }

    @Override
    public String toString() {
        return "School{" + "headmaster=" + headmaster + ", noOfFaulty=" + noOfFaulty + '}';
    }

   
   
    
}
