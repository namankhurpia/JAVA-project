/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment_four;

import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author Naman Khurpia
 */
public class UseBank {
    public static void main(String[] args) {
       Bank b=new Bank();
       
       Account a1=new Account(100,"Naman",1000);
       Account a2=new Account(101,"Ram",2000);
       Account a3=new Account(102,"Anushka",6500);
       Account a4=new Account(103,"Palash",8900);
        
       b.addAccount(100,a1);
       b.addAccount(101,a2);
       b.addAccount(102,a3);
       b.addAccount(103,a4);
       
       Scanner kb=new Scanner(System.in);
       
       while(true)
       {
        
           int choice=0;
        System.out.println(" ***********************\nEnter number for task \n 1 to get all accounts \n 2 get account details by account number \n 3 remove an account by account number \n 4 get total number of accounts \n 5 to exit \n***************");
        choice=kb.nextInt();
        switch(choice){
            case 1:
                {
                    b.getAllAccount();
                    break;
                }
            case 2:
            {
                System.out.println("Enter the account number");
                int acc=0;
                acc=kb.nextInt();
                b.getAccount(acc);
                break;
            }
            case 3:
            {
                System.out.println("Enter the account number to remove an account");
                int rem=kb.nextInt();
                b.removeAccount(rem);
                break;
                
            }
            case 4:
            {
                System.out.println("Total accounts are ");
                b.getCount();
                break;
            }
            default:
            {
                System.out.println("Please enter suitable choice");
                break;
            }
            case 5:
            {
                System.out.println("Ending prgram");
                System.exit(0);
            }
        }
        
        
       }//ending while
       
    }
    
}
