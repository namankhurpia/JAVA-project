/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment_three;

import java.util.Iterator;
import java.util.TreeSet;

/**
 *
 * @author Naman Khurpia
 */
public class Library {
    
    TreeSet<Book> ts=new TreeSet<>();
    
    public void addBook(Book b)
    {
       ts.add(b);
    }
    
    public void getBookCount()
    {
        int number=ts.size();
        System.out.println("Total books are "+number);
    }
    
    public void getAllBooks()
    {
        Iterator it;
        it = ts.iterator();
        while(it.hasNext())
        {
            System.out.println(it.next().toString());
        }
    }
    
}
