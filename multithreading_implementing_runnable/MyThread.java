/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package multithreading_implementing_runnable;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Naman Khurpia
 */

////CREATING threads by implementing runnable interface
public class MyThread implements Runnable{

    @Override
    public void run() {
        
     try{
            for(int i=2;i<=10;i++)
            {
            System.out.println("Child "+i);
                Thread.sleep(500);
            }
        }
            catch (InterruptedException ex) 
            {
                System.out.println("Child Interrupted");
            }
           
        System.out.println("Child finished");
        
    }
    
}
