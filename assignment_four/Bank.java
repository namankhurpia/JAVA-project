/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment_four;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/**
 *
 * @author Naman Khurpia
 */
public class Bank {
    
    HashMap<Integer,Account> hm = new HashMap<>();

    
    public void addAccount(int amt,Account a)
    {
        hm.put(amt,a);
    }
    
    public void getAccount(int acc)
    {
        Account a=hm.get(acc);
        if(a!=null)
            System.out.println(a.toString());
        else
            System.out.println("Account number incorrect");
    }
    
    public void removeAccount(int acc)
    {
        Account a=hm.get(acc);
        if(a!=null)
        { 
           a=hm.remove(acc);
            System.out.println("Account removed is "+a.toString());
        }
        else
            System.out.println("Account number incorrect");
        
    }
    
    public void getCount()
    {
        System.out.println(hm.size());
    }
    
    public void getAllAccount()
    {
        Set e=hm.entrySet();
       Iterator it= e.iterator();
       while(it.hasNext())
       {
           Entry et=(Map.Entry)it.next();
           System.out.println(et.getKey()+" , "+ et.getValue().toString());
       }
    }
}
