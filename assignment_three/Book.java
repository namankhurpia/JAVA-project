/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment_three;

/**
 *
 * @author Naman Khurpia
 */
public class Book implements Comparable {
    
    private String name,author;
    private int price;

    public Book(String name, String author, int price) {
        this.name = name;
        this.author = author;
        this.price = price;
    }
    
    //override compareto
    //sort in ascending order on basis of price
    //make sue no multiple books come in

    @Override
    public int compareTo(Object o) {
        Book b=(Book)o;
        if(this.name.equals(b.name))
        {
            return 0;
        }
        else 
        {
            if(this.price<b.price)
                return -1;
            else
                return 1;
        }
        
    }

    

    @Override
    public String toString() {
        return "Book{" + "name=" + name + ", author=" + author + ", price=" + price + '}';
    }


    
}
