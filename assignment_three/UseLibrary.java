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
public class UseLibrary {
    
    public static void main(String[] args) {
        
    Book b1=new Book("harry potter","jk rowling",500);
    Book b2=new Book("falut in our stars","jhon green",300);
    Book b3=new Book("Sherlock holmes","arthur conan doyle",600);
    Book b4=new Book("gone girl","gillian flynn",900);
    Book b5=new Book("harry potter","jk rowling",500);
    
    Library obj=new Library();
    obj.addBook(b1);
    obj.addBook(b2);
    obj.addBook(b3);
    obj.addBook(b4);
    obj.addBook(b5);
    
    obj.getAllBooks();
    obj.getBookCount();
    
  

    }
    
}
