/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg100monkeys;

/**
 *
 * @author mah537
 */
public class BankAccount {
    
    
    private double accountId;
    private double balance;
    private TownsFolk owner;
    
    
    
    
    public  BankAccount(double id, double balance){
    
    
        this.accountId = id;
        this.balance = balance;
    
    
    
    
    
    }  // end constructor
    
    
    
     public  BankAccount(TownsFolk t){
  
        this.owner = t;
    
    }  // end constructor
    
    
     
     
     public double getId(){
         return accountId;
     }
     
     public void setId(){
         
     }
     
     public double getBalance(){
        return balance; 
     }
     
     public void adjustBalance(double adjustment){
         
         balance = balance + adjustment;
     }
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
    
    
}  // end class
