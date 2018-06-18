/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignmentone;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Naman Khurpia
 */
public class question_two {
    public static void main(String []args)
    {
        Scanner kb=new Scanner(System.in);
        ArrayList<String> fruits=new ArrayList<>();
        for(int i=0;i<5;i++)
        {
            int j=i+1;
            System.out.println(j+" Enter fruit name");
            String fname=kb.nextLine();
            fruits.add(fname);
            
        }
        System.out.println("Enter the fruit name to remove");
        String rfruit=kb.nextLine();
        if(fruits.contains(rfruit))
        {
            fruits.remove(rfruit);
            System.out.println(fruits);
        }
        else
        {
            System.out.println("fruit not found");
        }          
    }    
}