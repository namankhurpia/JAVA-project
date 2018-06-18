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
public class questionone {
    public static void main(String []args)
    {
        ArrayList<String> worldcup=new ArrayList<>();
        worldcup.add(0,"Ronaldo");
        worldcup.add(1,"Messi");
        worldcup.add(2,"Neymar");
        worldcup.add(3,"Luis");
        worldcup.add(4,"Neuer");
        Scanner kb=new Scanner(System.in);
        System.out.println("enter player name");
        String name=kb.nextLine();
        int index=worldcup.indexOf(name);
        if(index==-1)
            System.out.println("PLayer not found");
        else
        { index=index+1;
            System.out.println("Player found, his rank is "+index);
        }
        
    }
    
}
