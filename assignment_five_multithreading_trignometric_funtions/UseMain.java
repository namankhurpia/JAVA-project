/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment_five_multithreading_trignometric_funtions;

import java.util.Scanner;

/**
 *
 * @author Naman Khurpia
 */
public class UseMain {
    public static void main(String[] args) {
        
        Scanner kb=new Scanner(System.in);
        System.out.println("Enter value of x in degrees");
        int x=kb.nextInt();
        System.out.println("Enter value of y in degrees");
        int y=kb.nextInt();
        System.out.println("Enter value of z in degrees");
        int z=kb.nextInt();
        
        main m1=new main("sin",x);
        main m2=new main("cos",y);
        main m3=new main("tan",z);
        
        try
        {
        m1.th.join();
        m2.th.join();
        m3.th.join();
        }
        catch(InterruptedException ex)
        {
            System.out.println("Interrupt caught in main");
        }
  
        float cal=m1.sinval+m2.cosval+m3.tanval;
        System.out.println("final value is "+cal);
        System.out.println("main finish");
    }
    
}
