/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment_two;

import java.util.Objects;

/**
 *
 * @author Naman Khurpia
 */
public class Book {
    private String name,author;
    int price;

    //constructor for initializing
    public Book(String name, String author, int price) {
        this.name = name;
        this.author = author;
        this.price = price;
    }

    //hashcode override
    @Override
    public int hashCode() {
        int hash = 3;
        hash = 41 * hash + Objects.hashCode(this.name);
        hash = 41 * hash + Objects.hashCode(this.author);
        hash = 41 * hash + this.price;
        return hash;
    }

    //equals override
    @Override
    public boolean equals(Object obj) {
       Book b=(Book)obj;
       if(this.name.equals(b.name) && this.author.equals(b.author) && this.price==(b.price))
           return true;
       else
           return false;
    }

    //toString override
    @Override
    public String toString() {
        return "Book{" + "name=" + name + ", author=" + author + ", price=" + price + '}';
    }
    
    
    
}
