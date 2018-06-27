/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment_five_multithreading_trignometric_funtions;

import static java.lang.Thread.sleep;

/**
 *
 * @author Naman Khurpia
 */
public class main implements Runnable{

    Thread th;
    String fun;
    int deg;
    float sinval,cosval,tanval,cal;
    public main(String str,int val)
    {
        th=new Thread(this,str);
        th.start();
        fun=str;
        deg=val;
    }
    
    @Override
    public void run() {
        try
        {
   
            if(fun.equals("sin"))
            {
                sinval=(float) Math.sin(Math.toRadians(deg));
                System.out.println("Value of sin is "+sinval); 
                sleep(1000);
            }
            else if(fun.equals("cos"))
            {
                cosval=(float)Math.cos(Math.toRadians(deg));
                System.out.println("Value of cos is "+cosval);
                sleep(1000);
            }
            else if(fun.equals("tan"))
            {
                tanval=(float)Math.tan(Math.toRadians(deg));
                System.out.println("Value of tan is "+tanval);
                sleep(1000);
            }
        }
        catch(InterruptedException ex)
                {
                    System.out.println("Interrupted while function");
                }

        System.out.println(fun+" function finish");
    }
   
}
