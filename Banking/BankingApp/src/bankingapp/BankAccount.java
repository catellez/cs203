
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
public class BankAccount {
    /**constructs item BankAccount that displays a name and balance
    *@param aName, the name of the account holder
    *@param aBalance, balance of the account*/
    public BankAccount(String aName, int aBalance){
        name = aName;
        balance = aBalance;
    }
    /**gets the name from a BankAccount
     * @param account, the BankAccount
     * @return the name in the BankAccount
     */
    public String getName(BankAccount account){
        return name;
    }
    /**gets the balance from a BankAccound
     * 
     * @param account, the BankAccount
     * @return the balance in the BankAccount
     */
    public int getBalance(BankAccount account){
        return balance;
    }
    /**
      Compares two accounts by balance.
      @param other the other account
      @return a negative number if this account has a smaller
      balance than otherAccount, 0 if the balances are the same,
      a positive number otherwise
   */
    public int compareTo(BankAccount other)
   {
      if (balance < other.balance) return -1;
      if (balance > other.balance) return 1;
      return 0;
   }
    
    public static Comparator<BankAccount> createComparatorByBalance(final boolean increasing){
       return new
           Comparator<BankAccount>(){
               public int compare(BankAccount account1, BankAccount account2){
                   if (increasing){
                       
                   if (account1.getBalance(account1) > account2.getBalance(account2)){
                       return 1;
                   }
                   else if (account1.getBalance(account1) < account2.getBalance(account2)){
                       return -1;
                   }
                   else{
                       return 0;
                   }
                   
                   }
                   else{
                       if (account1.getBalance(account1) < account2.getBalance(account2)){
                       return 1;
                   }
                   else if (account1.getBalance(account1) > account2.getBalance(account2)){
                       return -1;
                   }
                   else{
                       return 0;
                   }
                   }
               }
           };
   }
    
    private final String name;
    private final int balance;

    
    
}
