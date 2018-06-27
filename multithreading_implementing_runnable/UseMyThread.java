/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package multithreading_implementing_runnable;

/**
 *
 * @author Naman Khurpia
 */
public class UseMyThread {
    public static void main(String[] args) 
    {
        
        MyThread m1=new MyThread();
        Thread th=new Thread(m1);
        th.start();
        
    try
    {
        for(int i=2;i<=10;i++)
        {
            System.out.println("Child "+i);
            Thread.sleep(1000);
        }   
    }
    catch(InterruptedException ex)
    {
        System.out.println("Main Interrupted");
        
    }
    
        System.out.println("Main finished");
    }
}
