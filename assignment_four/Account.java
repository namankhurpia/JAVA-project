/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment_four;

/**
 *
 * @author Naman Khurpia
 */
public class Account { 
    private String Name;
    private int account_number , balance;

    
    public Account(int account_number,String Name, int balance) {
        this.Name = Name;
        this.account_number = account_number;
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "Account{" + "Name=" + Name + ", account_number=" + account_number + ", balance=" + balance + '}';
    }
    
    
}






