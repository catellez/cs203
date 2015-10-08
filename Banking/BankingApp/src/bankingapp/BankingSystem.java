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
public class BankingSystem {
   
    public static ArrayList<BankAccount> makeBankingSystem(){
    ArrayList<BankAccount> accounts = new ArrayList<BankAccount>();
        accounts.add(new BankAccount("Matthew Vassar", 60000));
        accounts.add(new BankAccount("Taylor Swift", 200000000));
        accounts.add(new BankAccount("Beyonce Knowles", 450000000));
        return accounts;
    }
        
         
         
    }
    

