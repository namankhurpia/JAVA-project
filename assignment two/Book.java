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
    private int price;

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
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Book other = (Book) obj;
        if (this.price != other.price) {
            return false;
        }
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (!Objects.equals(this.author, other.author)) {
            return false;
        }
        return true;
        
        
    }

    //toString override
    @Override
    public String toString() {
        return "Book{" + "name=" + name + ", author=" + author + ", price=" + price + '}';
    }
    
    
    
}
