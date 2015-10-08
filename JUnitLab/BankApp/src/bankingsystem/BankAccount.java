/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bankingsystem;

/**
 *
 * @author catellez
 */
public class BankAccount {
    
   
    
    public BankAccount(String aName, int aBalance){
        name = aName;
        balance = aBalance;
    }
    
    public String getName(BankAccount account){
        return this.name;
    }
    
    public int getBalance(BankAccount account){
        return this.balance;
    }
    
    private String name;
    private int balance;
}
