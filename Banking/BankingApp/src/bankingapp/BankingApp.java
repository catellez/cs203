/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bankingapp;

import java.util.*;

/**
 *
 * @author catellez
 */
public class BankingApp extends BankingSystem {

    /**
     * main function sets up a 
     * @param args the command line arguments
     */
    
    
    
    public static void main(String[] args) {
        ArrayList<BankAccount> accounts = makeBankingSystem();
        
        Collections.sort(accounts, BankAccount.createComparatorByBalance(true));
        for (BankAccount c: accounts){
            System.out.println(c.getName(c)+", "+c.getBalance(c));
        
    }
    
}
}