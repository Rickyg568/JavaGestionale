package com.entrypoint.library;

import java.util.ArrayList;

public class Controller {
    private ArrayList<Book> Books;
    
    public Controller(){
        Books = new ArrayList<Book>();
    }
    
    public void AddBook(Book book){
        Books.add(book);
    }
    
    public void ModBook(String Name,String Author, String Genre, int position){
        Books.remove(position);
        Books.add(position, new Book(Name,Genre,Author));
    }
    public void ModBook(String Name,String Author, String Genre, Book book){
        Books.set(Books.indexOf(book), new Book(Name,Genre,Author));
    }
    public void ModBook(Book book,int position){
        Books.remove(position);
        Books.add(position, book);
    }
    
    public void DeleteBook(Book book){
        Books.remove(book);
    }
    public void DeleteBook(int position){
        Books.remove(position);
    }
    
    
    public ArrayList<Book> GetList(){
        return Books;
    }
}
