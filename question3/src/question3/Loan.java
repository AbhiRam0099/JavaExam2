/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question3;

/**
 *
 * @author Abhilash Ramavaram
 */
public class Loan {
     private long loanId;
    private double amount;
    private double intrestrate;
    private int tenure;

    
    public Loan(long loanId, double amount,double intrestrate,int tenure) {
        this.loanId = loanId;
        this.amount = amount;
        this.intrestrate=intrestrate;
        this.tenure=tenure;
    }

   
    public long getLoanId() {
        return loanId;
    }

    public int getTenure() {
        return tenure;
    }

    public void setTenure(int tenure) {
        this.tenure = tenure;
    }

    
    public void setLoanId(long loanId) {
        this.loanId = loanId;
    }

    
    public double getAmount() {
        return amount;
    }

    public double getIntrestrate() {
        return intrestrate;
    }

    public void setIntrestrate(double intrestrate) {
        this.intrestrate = intrestrate;
    }

    
    public void setAmount(double amount) {
        this.amount = amount;
    }

    /** converts the constructor to string
     * 
     * @return string
     */
    @Override
    public String toString() {
        return "loanId=" + loanId + ", amount=" + amount +",intrestrate="+intrestrate+",tenure="+tenure;
    }
}
