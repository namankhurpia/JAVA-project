/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment_two;

import java.util.HashSet;

/**
 *
 * @author Naman Khurpia
 */
public class Library {
    
    HashSet<Book> hs=new HashSet<>();
    
    public void addBook(Book b)
    {
       hs.add(b);
    }
    
    public void getBookCount()
    {
        int number=hs.size();
        System.out.println("Total books are "+number);
    }
    
    public void getAllBooks()
    {
        for(Book s:hs)
            System.out.println(s);
    }
    public void show()
    {
        System.out.println("calling for fun");
    }
    
}
