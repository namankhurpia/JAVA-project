/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hash_sets;

import java.util.HashSet;

/**
 *
 * @author Naman Khurpia
 */
public class UseStudent {
    public static void main(String[] args) {
        
        HashSet<student> hs=new HashSet<>();
        
        student s1=new student("Amit");
        student s2=new student("Sumit");
        student s3=new student("Amit");
        
        hs.add(s1);
        hs.add(s2);
        hs.add(s3);
        
        System.out.println(hs);
        
    }
    
}
